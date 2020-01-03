package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_Interface_Header;
import com.bsol.q88.model.Q88_VoyLstChanged;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88_VoyLstChangedService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//@Component
//@EnableScheduling
public class Q88VoyLstChangedAPI {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;
	
	@Autowired
	private Q88_VoyLstChangedService voyLstService;
	
	@Autowired
	private Q88InterfaceHeaderService headerService;
	
	@Scheduled(cron = "0 */1 * ? * *")
	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVoyLstChanged();

		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVoyLstChanged();

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getVoyLstChanged();
			

		}
	}
	
	void getVoyLstChanged() throws Exception{
		LocalDateTime modifiedDate = headerService.getLastModifiedDate("Voyage/VoyageListChanged");
		if (modifiedDate == null || modifiedDate.equals("")) {
			modifiedDate = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		}
		
		JSONArray json1;
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String url = "https://webapi.q88.com/Voyage/GetVoyageListChangedSince?modifiedDate="+"2019-01-01";
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;

		startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token)
				.addHeader("Connection", "close").build();
		try {

			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			if (response.isSuccessful()) {
				endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			}
			json1 = new JSONArray(response.body().string().toString());
			System.out.println("url " + url);
			System.out.println("json1 array " + json1);
			Gson gson = new GsonBuilder().serializeNulls().create();

			int modifiedDateCount = headerService.ModifiedDateCountforFirsTime("Voyage/VoyageListChanged");
			
			if (modifiedDateCount == 0) {
				for (int i = 0; i < json1.length(); i++) {
					LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
					Q88_VoyLstChanged voyLstChange = gson.fromJson(json1.getJSONObject(i).toString(), Q88_VoyLstChanged.class);
					System.out.println("if  voyLst "+voyLstChange);
					voyLstChange.setModified_Date(voyLstChange.getModifiedDate());
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("Voyage/VoyageListChanged");
						header.setVoyageId(voyLstChange.getVoyageId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(voyLstChange.getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setIs_processed("N");
						headerService.saveHeader(header);

						voyLstChange.setTrans_Id(transId);
						voyLstService.saveVoyLstChanged(voyLstChange);
				

				}
			}
			
			else if(modifiedDateCount !=0) {
				for(int i =0;i<json1.length();i++) {
					LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
					Q88_VoyLstChanged voyLstChange = gson.fromJson(json1.getJSONObject(i).toString(), Q88_VoyLstChanged.class);
					System.out.println("else  voyLst "+voyLstChange);
					voyLstChange.setModified_Date(voyLstChange.getModifiedDate());
					if(voyLstChange.getModified_Date().isAfter(modifiedDate)) {
						System.out.println("voyLst Modified Date " +voyLstChange.getModified_Date());
						System.out.println("Last Modified Date "+modifiedDate);
					Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("Voyage/VoyageListChanged");
						header.setVoyageId(voyLstChange.getVoyageId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(voyLstChange.getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setIs_processed("N");
						headerService.saveHeader(header);

						voyLstChange.setTrans_Id(transId);
						voyLstService.saveVoyLstChanged(voyLstChange);
					}
					
				}
				
			}

			System.out.println("inserted ");

		}

		catch (SocketTimeoutException expected) {
			getVoyLstChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

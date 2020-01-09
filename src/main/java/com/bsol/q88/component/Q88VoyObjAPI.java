package com.bsol.q88.component;

import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_Interface_Header;
import com.bsol.q88.model.Q88_VoyObj;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88VoyObjService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//@Component
//@EnableScheduling
public class Q88VoyObjAPI {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;
	
	@Autowired
	private Q88VoyObjService voyObjService;
	
	@Autowired
	private Q88InterfaceHeaderService headerService;
	
	@Scheduled(cron = "0 */1 * ? * *")
	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVoyObj();

		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVoyObj();

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getVoyObj();

		}
	}
	
	void getVoyObj() throws Exception{
		
		List<Q88_Interface_Header> voyObjId = headerService.getAllunProcessedRecords("Voyage/VoyageListChanged", "N");
		System.out.println("voyObjIds  is " +voyObjId);
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		JSONObject json1;
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		LocalDateTime lastmodifiedDate = headerService.getLastModifiedDate("Voyage/VoyageListChanged");
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;
		
		
		
		for (Q88_Interface_Header interfaceheader : voyObjId) {
			LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			String url = "https://webapi.q88.com/Voyage/GetVoyageObject?voyageId="
					+ interfaceheader.getVoyageId();
			startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			
			try {
				Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token)
						.addHeader("Connection", "close").build();
				Response response = client.newCall(request).execute();
				if (!response.isSuccessful()) {
					//throw new IOException("Unexpected code " + response);
				System.out.println("unSuccessfull response " +response);
				}
				
			
				if(!response.isSuccessful()) {
				String response1  = response.body().string().toString();
					if(response.code() == 401 || response1 =="" || response1 == null) {
						headerService.updateVoyageObjNonProcess("Voyage/VoyageListChanged",interfaceheader.getVoyageId(), interfaceheader.getTrans_Id(),"No Content");
					}
				}
				if (response.isSuccessful()) {
					System.out.println("Hello");
					endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
				
				json1 = new JSONObject(response.body().string().toString());
				System.out.println("json1 is " + json1);
				Gson gson = new GsonBuilder().serializeNulls().create();
				Q88_VoyObj voyObj = gson.fromJson(json1.toString(), Q88_VoyObj.class);
				
				Integer transId = headerService.getTransId();
				Q88_Interface_Header header = new Q88_Interface_Header();
				header.setTrans_Id(transId);
				header.setApiCall("Voyage/GetVoyageObject");
				header.setVoyageId(voyObj.getVoyageId());
				header.setVesselIDEncrypt(voyObj.getVesselId());
				header.setTcOutIdEncrypt(voyObj.getTcOutIdEncrypted());
				header.setCallStart(startTime);
				header.setCallEnd(endTime);
				
				header.setStatus("Success");
				header.setRecordProcessed(1);
				header.setUserIns("DBO");
				header.setDateIns(dateIns);
				header.setIs_processed("Y");
				headerService.saveHeader(header);
				
				voyObj.setTrans_Id(transId);
				voyObjService.saveVoyObj(voyObj);
				headerService.updateVoyobjRecords("Y", "Voyage/VoyageListChanged", interfaceheader.getTrans_Id(), interfaceheader.getVoyageId());
				System.out.println("Insert is completed");
				
				}
				
			}

			catch (SocketTimeoutException expected) {
				checkTokenExpires();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
	
	
	
	
	
	
	
}

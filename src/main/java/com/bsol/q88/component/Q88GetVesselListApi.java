package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_Interface_Header;
import com.bsol.q88.model.Q88_VesselList;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88VesselListService;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Component
@EnableScheduling
public class Q88GetVesselListApi {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;
	
	@Autowired
	private Q88VesselListService vesselService;
	
	@Autowired
	private Q88InterfaceHeaderService headerService;
	
	Logger logger = Logger.getLogger(this.getClass());
	
	
	void checkTokenExpires() throws Exception {
		
		logger.info("Q88GetVesselList Api Started and checking the token");
		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getVesselList();

		} else if (expireResult.equals("after")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getVesselList();
			

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getVesselList();

		}
	}
	
	void getVesselList() throws Exception {
		JSONArray responseJsonArray;
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");

		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String apiVersion = properties.getProperty("q88.APiVersionNumber").toString();
		String url = "https://webapi.q88.com/Vessel/GetVesselList";
		LocalDateTime startTime =null;
		LocalDateTime endTime=null;

		startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		Request request = new Request.Builder().url(url)
						.addHeader("Authorization", "Bearer " + token).addHeader("Connection", "close").build();
		try {

			Response response = client.newCall(request).execute();

			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			if(response.isSuccessful()) {
				endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
				
			}

			responseJsonArray = new JSONArray(response.body().string().toString());
			Gson gson = new Gson();
			LocalDateTime modifiedDate = headerService.getLastModifiedDate("Vessel/GetVesselList");
			for (int i = 0; i < responseJsonArray.length(); i++) {
				LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
				Q88_VesselList vessel = gson.fromJson(responseJsonArray.getJSONObject(i).toString(), Q88_VesselList.class);
				vessel.setModified_Date(vessel.getModifiedDate());
				logger.info("Modiied date of vessel is " +modifiedDate);
				if (modifiedDate != null) {
					if (vessel.getModified_Date().isAfter(modifiedDate)) {
						
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("Vessel/GetVesselList");
						header.setVesselIDEncrypt(vessel.getVesselId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(vessel.getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setIs_processed("N");
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setVersionNumber(apiVersion);
						headerService.saveHeader(header);
						
						vessel.setTrans_Id(transId);
						vesselService.saveVesselList(vessel);
					}
				}
				else  {
					Integer transId = headerService.getTransId();
					Q88_Interface_Header header = new Q88_Interface_Header();
					header.setTrans_Id(transId);
					header.setApiCall("Vessel/GetVesselList");
					header.setVesselIDEncrypt(vessel.getVesselId());
					header.setCallStart(startTime);
					header.setCallEnd(endTime);
					header.setModifiedDate(vessel.getModifiedDate());
					header.setStatus("Success");
					header.setRecordProcessed(1);
					header.setIs_processed("N");
					header.setUserIns("DBO");
					header.setDateIns(dateIns);
					header.setVersionNumber(apiVersion);
					headerService.saveHeader(header);
					
					vessel.setTrans_Id(transId);
					vesselService.saveVesselList(vessel);
					
				}
				
			}
			logger.info("Q88GetVesselList Inserting records into staging table is completed");
			
		} catch (SocketTimeoutException expected) {
			logger.error("Exception raised in Q88GetVesselListAPi Exception " +expected);
		} catch (Exception e) {
			logger.error("Exception raised in Q88GetVesselListAPi Exception " +e);
		}

		
	}

}

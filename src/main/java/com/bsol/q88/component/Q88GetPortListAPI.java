package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.Q88SampleAppApplication;
import com.bsol.q88.model.Q88_Interface_Header;
import com.bsol.q88.model.Q88_PortList;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88PortListService;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


@Component
@EnableScheduling
public class Q88GetPortListAPI {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;

	@Autowired
	private Q88PortListService portService;

	@Autowired
	private Q88InterfaceHeaderService headerService;
	
	Logger logger = Logger.getLogger(this.getClass());

	
	void checkTokenExpires() throws Exception {
		logger.info("Q88PortList API Started checking Token expired or not ");
		String expireResult = checkToken.checkTokenExpires();
		
		if (expireResult.equals("before")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getPortLists();
		} else if (expireResult.equals("after")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getPortLists();
		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getPortLists();
		}
	}

	void getPortLists() throws Exception {
		logger.info("Q88PortList API request object creation started ");
		JSONArray responseJsonArray;
		LocalDateTime modifiedDate = headerService.getLastModifiedDate("ReferenceData/GetPortList");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");

		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String apiVersion = properties.getProperty("q88.APiVersionNumber").toString();
		String url = "https://webapi.q88.com/ReferenceData/GetPortList";
		LocalDateTime startTime =null;
		LocalDateTime endTime=null;

		startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token)
				.addHeader("Connection", "close").build();
		try {

			Response response = client.newCall(request).execute();

			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			if(response.isSuccessful()) {
			endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			logger.info("Q88PortList API response is successfull response " );
			}
			// System.out.println("Server: " + response.body().string().toString());
			responseJsonArray = new JSONArray(response.body().string().toString());
			Gson gson = new Gson();
			for (int i = 0; i < responseJsonArray.length(); i++) {
				LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
				Q88_PortList port = gson.fromJson(responseJsonArray.getJSONObject(i).toString(),Q88_PortList.class);
				port.setModified_Date(port.getModifiedDate());
				if (modifiedDate != null) {
					if (port.getModified_Date().isAfter(modifiedDate)) {
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("ReferenceData/GetPortList");
						header.setPortId(port.getPortId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(port.getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setIs_processed("Y");
						header.setVersionNumber(apiVersion);
						headerService.saveHeader(header);
						
						port.setTrans_Id(transId);
						portService.savePortList(port);
					}

				}
				else {
					Integer transId = headerService.getTransId();
					Q88_Interface_Header header = new Q88_Interface_Header();
					header.setTrans_Id(transId);
					header.setApiCall("ReferenceData/GetPortList");
					header.setPortId(port.getPortId());
					header.setCallStart(startTime);
					header.setCallEnd(endTime);
					header.setModifiedDate(port.getModifiedDate());
					header.setStatus("Success");
					header.setRecordProcessed(1);
					header.setUserIns("DBO");
					header.setDateIns(dateIns);
					header.setIs_processed("Y");
					header.setVersionNumber(apiVersion);
					headerService.saveHeader(header);
					
					port.setTrans_Id(transId);
					portService.savePortList(port);
				}

				
			}
			logger.info("Q88PortList API Data insertion into staging table is completed");
			

		} catch (SocketTimeoutException expected) {
			getPortLists();
		logger.error("Exception is occurred in Q88GetPortListApi exception is " +expected);
		} catch (Exception e) {
			logger.error("Exception is occurred in Q88GetPortListApi exception is " +e);
		}

	}

	public List<Q88_PortList> portListFilter(List<Q88_PortList> list1,
			List<Q88_PortList> list2) {

		List<Q88_PortList> res1 = list1.stream()
				.filter(o1 -> list2.stream().noneMatch(o2 -> o2.equals(o1))).collect(Collectors.toList());
		return res1;
	}

}

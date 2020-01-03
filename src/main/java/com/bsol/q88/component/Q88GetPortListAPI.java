package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_Interface_Header;
import com.bsol.q88.model.Q88_PortList;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88PortListService;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//@Component
//@EnableScheduling
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

	@Scheduled(cron = "0 */1 * ? * *")
	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			getPortLists();
		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getPortLists();
		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getPortLists();
		}
	}

	void getPortLists() throws Exception {
		JSONArray json1;

		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");

		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
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
			}
			// System.out.println("Server: " + response.body().string().toString());
			json1 = new JSONArray(response.body().string().toString());
			Gson gson = new Gson();
			LocalDateTime lastStartTime = headerService.getLastCallTime("ReferenceData/GetPortList");
			for (int i = 0; i < json1.length(); i++) {
				LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
				Q88_PortList port = gson.fromJson(json1.getJSONObject(i).toString(),Q88_PortList.class);
				port.setModified_Date(port.getModifiedDate());
				if (lastStartTime != null) {
					if (port.getModified_Date().isAfter(lastStartTime)) {
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("ReferenceData/GetPortList");
						header.setPortId(port.getPortId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
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
					header.setStatus("Success");
					header.setRecordProcessed(1);
					header.setUserIns("DBO");
					header.setDateIns(dateIns);
					headerService.saveHeader(header);
					
					port.setTrans_Id(transId);
					portService.savePortList(port);
				}

				
			}
			System.out.println("Port : completeed");
			// destination = portService.getAllPorList();
			// difference = portListFilter(Q88source, destination);

			// System.out.println("difference "+difference);
			/*
			 * for (Q88_PortList list : difference) { System.out.println("inside for loop");
			 * System.out.println(list.getPortId()); portService.savePortList(list); }
			 */

		} catch (SocketTimeoutException expected) {
			getPortLists();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Q88_PortList> portListFilter(List<Q88_PortList> list1,
			List<Q88_PortList> list2) {

		List<Q88_PortList> res1 = list1.stream()
				.filter(o1 -> list2.stream().noneMatch(o2 -> o2.equals(o1))).collect(Collectors.toList());
		return res1;
	}

}

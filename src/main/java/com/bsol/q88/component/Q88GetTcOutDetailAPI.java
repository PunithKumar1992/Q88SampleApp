package com.bsol.q88.component;

import java.io.IOException;
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
import com.bsol.q88.model.Q88_TcOutDtl;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88TcOutListDetailService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//@Component
//@EnableScheduling
public class Q88GetTcOutDetailAPI {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;

	@Autowired
	private Q88TcOutListDetailService tcOutLsdtlService;

	@Autowired
	private Q88InterfaceHeaderService headerService;

	@Scheduled(cron = "0 */1 * ? * *")
	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			getTcOutDetails();

		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getTcOutDetails();

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getTcOutDetails();

		}
	}

	void getTcOutDetails() throws Exception {

		List<Q88_Interface_Header> tcOutEncryptedId = headerService.getAllunProcessedRecords("TcOut/TcOutList", "N");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		JSONObject json1;
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		LocalDateTime lastmodifiedDate = headerService.getLastModifiedDate("TcOut/TcOutList");
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;
		
		System.out.println("tcOutEncryptedIds " +tcOutEncryptedId);
		
		
		for (Q88_Interface_Header interfaceheader : tcOutEncryptedId) {
			LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			String url = "https://webapi.q88.com/TCOut/GetTCOutDetail?tcOutIdEncrypted="
					+ interfaceheader.getTcOutIdEncrypt();
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
				json1 = new JSONObject(response.body().string().toString());
				System.out.println("json1 is " + json1);
				Gson gson = new GsonBuilder().serializeNulls().create();
				Q88_TcOutDtl tcOutDetail = gson.fromJson(json1.toString(), Q88_TcOutDtl.class);
				tcOutDetail.getContract().setModified_Date(tcOutDetail.getContract().getModifiedDate());

				if (lastmodifiedDate != null) {
					if (tcOutDetail.getContract().getModified_Date().isAfter(lastmodifiedDate)) {
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("TcOut/TcOutDetail");
						header.setVesselIDEncrypt(tcOutDetail.getVesselIdEncrypted());
						header.setTcOutIdEncrypt(tcOutDetail.getTcOutIdEncrypted());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(tcOutDetail.getContract().getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setIs_processed("Y");
						headerService.saveHeader(header);
						
						tcOutDetail.setTrans_Id(transId);
						tcOutLsdtlService.saveTcOutListDetails(tcOutDetail);
						headerService.updateTcOutDtlRecords("Y", "TcOut/TcOutList", interfaceheader.getTrans_Id(), interfaceheader.getVesselIDEncrypt(), interfaceheader.getTcOutIdEncrypt());
						System.out.println("Insert is completed");
					}

				} else {
					Integer transId = headerService.getTransId();
					Q88_Interface_Header header = new Q88_Interface_Header();
					header.setTrans_Id(transId);
					header.setApiCall("TcOut/TcOutDetail");
					header.setVesselIDEncrypt(tcOutDetail.getVesselIdEncrypted());
					header.setTcOutIdEncrypt(tcOutDetail.getTcOutIdEncrypted());
					header.setCallStart(startTime);
					header.setCallEnd(endTime);
					header.setModifiedDate(tcOutDetail.getContract().getModifiedDate());
					header.setStatus("Success");
					header.setRecordProcessed(1);
					header.setUserIns("DBO");
					header.setDateIns(dateIns);
					header.setIs_processed("Y");
					headerService.saveHeader(header);
					
					tcOutDetail.setTrans_Id(transId);
					tcOutLsdtlService.saveTcOutListDetails(tcOutDetail);
					headerService.updateTcOutDtlRecords("Y", "TcOut/TcOutList", interfaceheader.getTrans_Id(), interfaceheader.getVesselIDEncrypt(), interfaceheader.getTcOutIdEncrypt());
					System.out.println("Insert is completed");

				}

			}

			catch (SocketTimeoutException expected) {
				getTcOutDetails();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}

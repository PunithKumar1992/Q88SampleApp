package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
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

@Component
@EnableScheduling
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
	
	Logger logger = Logger.getLogger(this.getClass());

	
	void checkTokenExpires() throws Exception {

		logger.info("Q88GetcOutDetails APi Started and checking token ");
		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getTcOutDetails();

		} else if (expireResult.equals("after")) {
			//refreshtoken.getAccessTokenByRefreshToken();
			token.getAccessToken();
			getTcOutDetails();

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getTcOutDetails();

		}
	}

	void getTcOutDetails() throws Exception {

		List<Q88_Interface_Header> tcOutEncryptedId = headerService.getAllunProcessedRecords("TcOut/TcOutList", "N");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		JSONObject responseJsonObject;
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String apiVersion = properties.getProperty("q88.APiVersionNumber").toString();
		LocalDateTime lastmodifiedDate = headerService.getLastModifiedDate("TcOut/TcOutList");
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;
		
		
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
				responseJsonObject = new JSONObject(response.body().string().toString());
				Gson gson = new GsonBuilder().serializeNulls().create();
				Q88_TcOutDtl tcOutDetail = gson.fromJson(responseJsonObject.toString(), Q88_TcOutDtl.class);
				tcOutDetail.getContract().setModified_Date(tcOutDetail.getContract().getModifiedDate());

				if (lastmodifiedDate != null) {
					if (tcOutDetail.getContract().getModified_Date().isAfter(lastmodifiedDate)) {
						Integer transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("TcOut/TcOutDetail");
						header.setVesselIDEncrypt(tcOutDetail.getContract().getVesselIdEncrypted());
						header.setTcOutIdEncrypt(tcOutDetail.getContract().getTcOutIdEncrypted());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setModifiedDate(tcOutDetail.getContract().getModifiedDate());
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setIs_processed("Y");
						header.setVersionNumber(apiVersion);
						headerService.saveHeader(header);
						
						tcOutDetail.setTrans_Id(transId);
						tcOutLsdtlService.saveTcOutListDetails(tcOutDetail);
						headerService.updateTcOutDtlRecords("Y", "TcOut/TcOutList", interfaceheader.getTrans_Id(), interfaceheader.getVesselIDEncrypt(), interfaceheader.getTcOutIdEncrypt());
					}

				} else {
					Integer transId = headerService.getTransId();
					Q88_Interface_Header header = new Q88_Interface_Header();
					header.setTrans_Id(transId);
					header.setApiCall("TcOut/TcOutDetail");
					header.setVesselIDEncrypt(tcOutDetail.getContract().getVesselIdEncrypted());
					header.setTcOutIdEncrypt(tcOutDetail.getContract().getTcOutIdEncrypted());
					header.setCallStart(startTime);
					header.setCallEnd(endTime);
					header.setModifiedDate(tcOutDetail.getContract().getModifiedDate());
					header.setStatus("Success");
					header.setRecordProcessed(1);
					header.setUserIns("DBO");
					header.setDateIns(dateIns);
					header.setIs_processed("Y");
					header.setVersionNumber(apiVersion);
					headerService.saveHeader(header);
					
					tcOutDetail.setTrans_Id(transId);
					tcOutLsdtlService.saveTcOutListDetails(tcOutDetail);
					headerService.updateTcOutDtlRecords("Y", "TcOut/TcOutList", interfaceheader.getTrans_Id(), interfaceheader.getVesselIDEncrypt(), interfaceheader.getTcOutIdEncrypt());

				}
				logger.info("Q88GetcOutDetails APi save is completed successfully ");
			}

			catch (SocketTimeoutException expected) {
				getTcOutDetails();
				logger.error("Exception occurred in Q88TcoutDetail Api Exception " +expected);
			} catch (Exception e) {
				logger.error("Exception occurred in Q88TcOutDetail Api Exception " +e);
			}

		}

	}

}

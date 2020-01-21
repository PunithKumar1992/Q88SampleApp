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
import com.bsol.q88.model.Q88_VoyObj;
import com.bsol.q88.model.Q88_VslRegDtl;
import com.bsol.q88.model.Q88_VslRegDtl_HeadContractDtl;
import com.bsol.q88.service.Q88InterfaceHeaderService;
import com.bsol.q88.service.Q88VslRegDtlService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Component
public class Q88VslRegDtlApi {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;

	@Autowired
	private Q88InterfaceHeaderService headerService;

	@Autowired
	private Q88VslRegDtlService vslRegdtlService;


	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVslRegDtl();

		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getVslRegDtl();

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getVslRegDtl();

		}
	}

	void getVslRegDtl() throws Exception {

		List<Q88_Interface_Header> vslId = headerService.getAllunProcessedRecords("Vessel/GetVesselList", "N");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		JSONObject json1;
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String apiVersion = properties.getProperty("q88.APiVersionNumber").toString();
		LocalDateTime startTime = null;
		LocalDateTime endTime = null;

		for (Q88_Interface_Header interfaceheader : vslId) {
			LocalDateTime dateIns = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
			String url = "https://webapi.q88.com/Vessel/GetVesselRegisterDetail?vesselIdEncrypted="
					+ interfaceheader.getVesselIDEncrypt();
			startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);

			try {
				Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token)
						.addHeader("Connection", "close").build();
				Response response = client.newCall(request).execute();
				if (!response.isSuccessful()) {
					throw new IOException("Unexpected code " + response);
				}
				if (response.isSuccessful()) {
					endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
					json1 = new JSONObject(response.body().string().toString());
					System.out.println("json1 is " + json1);
					Gson gson = new GsonBuilder().serializeNulls().create();

					Q88_VslRegDtl vslRegDtlObj = gson.fromJson(json1.toString(), Q88_VslRegDtl.class);
					Integer transId =null;
					List<Q88_VslRegDtl_HeadContractDtl> contrctDtl = vslRegDtlObj.getHeadContract().getList();
					if (contrctDtl != null) {
						for (Q88_VslRegDtl_HeadContractDtl contact : contrctDtl) {
							 transId = headerService.getTransId();
							Q88_Interface_Header header = new Q88_Interface_Header();
							header.setTrans_Id(transId);
							header.setApiCall("Vessel/GetVesselRegisterDetail");
							header.setVesselIDEncrypt(vslRegDtlObj.getVesselId());
							header.setTcInIdEncrypt(contact.getTcInIdEncrypted());
							header.setCallStart(startTime);
							header.setCallEnd(endTime);
							header.setStatus("Success");
							header.setRecordProcessed(1);
							header.setUserIns("DBO");
							header.setDateIns(dateIns);
							header.setIs_processed("N");
							header.setVersionNumber(apiVersion);
							headerService.saveHeader(header);
						}
					}
					if (contrctDtl == null || contrctDtl.size() == 0) {
						transId = headerService.getTransId();
						Q88_Interface_Header header = new Q88_Interface_Header();
						header.setTrans_Id(transId);
						header.setApiCall("Vessel/GetVesselRegisterDetail");
						header.setVesselIDEncrypt(vslRegDtlObj.getVesselId());
						header.setCallStart(startTime);
						header.setCallEnd(endTime);
						header.setStatus("Success");
						header.setRecordProcessed(1);
						header.setUserIns("DBO");
						header.setDateIns(dateIns);
						header.setReason("No Data for TcIn Id Encrypted");
						header.setIs_processed("N");
						header.setVersionNumber(apiVersion);
						headerService.saveHeader(header);
					}

					vslRegDtlObj.setTrans_Id(transId);
					vslRegdtlService.saveVslRegDtl(vslRegDtlObj);

					headerService.updateVesselRecord("Y", "Vessel/GetVesselList", interfaceheader.getTrans_Id(),
							interfaceheader.getVesselIDEncrypt());
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

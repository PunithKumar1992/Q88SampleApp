package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_TcOutListDetails;
import com.bsol.q88.service.Q88TcOutListService;
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
	private Q88TcOutListService tcOutListService;

	
	
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
		
		List<String> tcOutEncryptedId = tcOutListService.getTcOutEncryptedId();
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		JSONObject json1;
		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		
		for(String tcOutId : tcOutEncryptedId) {
			String url = "https://webapi.q88.com/TCOut/GetTCOutDetail?tcOutIdEncrypted="+tcOutId;
			Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token).addHeader("Connection", "close").build();
			try {

				Response response = client.newCall(request).execute();
				if (!response.isSuccessful()) {
					throw new IOException("Unexpected code " + response);
				}
				json1 = new JSONObject(response.body().string().toString());
				Gson gson = new GsonBuilder().serializeNulls().create();
				Q88_TcOutListDetails tcOutDetail = gson.fromJson(json1.toString(), Q88_TcOutListDetails.class);
				
				System.out.println("tcOutDetail "+tcOutDetail);
				
			}

			catch (SocketTimeoutException expected) {
				getTcOutDetails();
			} catch (Exception e) {
				e.printStackTrace();
			}

			
		}
		
		
	}
	
	


}

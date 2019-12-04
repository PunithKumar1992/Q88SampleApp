package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.time.DateUtils;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.service.Q88TcOutListService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

//@Component
//@EnableScheduling
public class Q88GetTcOutListAPI {

	@Autowired
	private CheckToken checkToken;

	@Autowired
	private AccessToken token;

	@Autowired
	private RefreshToken refreshtoken;

	@Autowired
	private Q88TcOutListService tcoutService;

	@Scheduled(cron = "0 */1 * ? * *")
	void checkTokenExpires() throws Exception {

		String expireResult = checkToken.checkTokenExpires();

		if (expireResult.equals("before")) {
			getTcOutList();

		} else if (expireResult.equals("after")) {
			refreshtoken.getAccessTokenByRefreshToken();
			getTcOutList();
			

		} else if (expireResult.equals("expired")) {
			token.getAccessToken();
			getTcOutList();

		}
	}

	void getTcOutList() throws Exception {
		
		Q88_TcOutList tcoutobj  = new Q88_TcOutList();

		int addMinuteTime = 5;
		String modifiedDate = tcoutService.getLastRuntime("GetTCOutList");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date = dateFormat.parse(modifiedDate);
		date = DateUtils.addMinutes(date, addMinuteTime);
		String update = dateFormat.format(date).toString();
		System.out.println("update " +update);
		//tcoutService.updateLastRuntime(update, "GetTCOutList");
		JSONArray json1;
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");

		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String url = "https://webapi.q88.com/TCOut/GetTCOutList?modifiedDate=" + modifiedDate;
		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token).addHeader("Connection", "close").build();
		try {

			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			json1 = new JSONArray(response.body().string().toString());
			Gson gson = new GsonBuilder().serializeNulls().create();
			for (int i = 0; i < json1.length(); i++) {
				Q88_TcOutList tcout = gson.fromJson(json1.getJSONObject(i).toString(), Q88_TcOutList.class);
				//System.out.println(tcout);
				tcoutService.saveTcOutList(tcout);
			}
		
			tcoutobj = tcoutService.getVoyageobject("61DAFB33177871D584402E691C8C912D", "3B7021EECE56FE8A78DE13C01882D163");	
			System.out.println(tcoutobj);
			
			System.out.println("inserted ");
			
		}

		catch (SocketTimeoutException expected) {
			getTcOutList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}

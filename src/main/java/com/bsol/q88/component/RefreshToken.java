package com.bsol.q88.component;

import java.io.IOException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

@Component(value = "NewRefreshToken")
public class RefreshToken {
	
	@Autowired
	private ApiVersion apiVersion;

	public void getAccessTokenByRefreshToken() throws Exception {
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("Q88refresh Token Started");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		String refresh_token = properties.getProperty("q88.token.refresh_token").toString();
		String access_token = properties.getProperty("q88.token.access_token").toString();

		OkHttpClient client = new OkHttpClient();

		RequestBody formBody = new FormEncodingBuilder()
				.add("grant_type", "refresh_token")
				.add("refresh_token", refresh_token)
				.add("client_id", "WebApiVmsProduction")
				.add("client_secret","DBA610E42E0C8CAA2AEE9687B3224B9E0B35B0014C095322A15F3E48DA63468B93A7E07F3ECDDEE1592285624E365F56E7C49261F080AE4A")
				.build();
		Request request = new Request.Builder().url("https://webapi.q88.com/Authenticate/Login").post(formBody)
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.addHeader("Authorization", "Bearer " + access_token).build();

		Response response = client.newCall(request).execute();
		if (!response.isSuccessful())
			throw new IOException("Unexpected code " + response);
		if (response.isSuccessful()) {
			JSONObject json = new JSONObject(response.body().string().toString());
			PropertiesConfiguration prop = new PropertiesConfiguration("src/main/resources/token.properties");
			prop.setProperty("q88.token.access_token", json.get("access_token").toString());
			prop.setProperty("q88.token.refresh_token", json.get("refresh_token").toString());
			prop.setProperty("q88.token.token_type", json.get("token_type").toString());
			prop.setProperty("q88.token.expires_in", json.get("expires_in").toString());
			prop.setProperty("q88.token.client_id", json.get("as:client_id").toString());
			prop.setProperty("q88.token.issued", json.get(".issued").toString());
			prop.setProperty("q88.token.expires", json.get(".expires").toString());
			prop.save();
			apiVersion.getApiVersion();
			logger.info("Refresh token exceuted successfully");
		}
	}

	public static void main(String[] args) throws Exception {

		RefreshToken token = new RefreshToken();
		token.getAccessTokenByRefreshToken();

	}

}

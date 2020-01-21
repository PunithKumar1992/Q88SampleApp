package com.bsol.q88.component;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.bsol.q88.Q88SampleAppApplication;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

@Component(value = "AccessToken")
public class AccessToken {

	@Autowired
	private ApiVersion apiversion;
	

	
	
	public void getAccessToken() throws Exception {
		
		 Logger logger = Logger.getLogger(this.getClass());
		logger.info("Q88 AccessToken Started");
		OkHttpClient client = new OkHttpClient();

		RequestBody formBody = new FormEncodingBuilder()
				.add("client_id", "WebApiVmsProduction")
				.add("client_secret","DBA610E42E0C8CAA2AEE9687B3224B9E0B35B0014C095322A15F3E48DA63468B93A7E07F3ECDDEE1592285624E365F56E7C49261F080AE4A")
				.add("username", "gbabu")
				.add("password", "Intlseas$123")
				.add("grant_type", "password")
				.build();
		Request request = new Request.Builder().url("https://webapi.q88.com/Authenticate/Login").post(formBody)
				.addHeader("Content-Type", "application/x-www-form-urlencoded").build();

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
			logger.info("Q88Access token executed successfuly ");
			apiversion.getApiVersion();
	
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		AccessToken token = new  AccessToken();
		TimeZone timeZone = TimeZone.getTimeZone("UTC");
		Calendar calendar = Calendar.getInstance(timeZone);
		SimpleDateFormat dateformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.US);
		dateformat.setTimeZone(timeZone);
		//System.out.println("Calendar " +calendar.get(Calendar.DAY_OF_MONTH));
		
		
		token.getAccessToken();
	}
}

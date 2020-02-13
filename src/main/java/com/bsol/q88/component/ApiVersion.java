package com.bsol.q88.component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Component(value = "ApiVersion")
public class ApiVersion {
	
	Logger logger = Logger.getLogger(this.getClass());

	public Void getApiVersion() throws Exception {
		
	logger.info("Q88 Integration Application Api Version is Started");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");

		OkHttpClient client = new OkHttpClient();
		client.setConnectTimeout(30, TimeUnit.SECONDS);
		client.setReadTimeout(30, TimeUnit.SECONDS);
		client.setWriteTimeout(30, TimeUnit.SECONDS);
		client.setRetryOnConnectionFailure(true);
		String token = properties.getProperty("q88.token.access_token").toString();
		String url = "https://webapi.q88.com/ReferenceData/GetWebApiVersionNumber";

		Request request = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + token)
				.addHeader("Connection", "close").build();
		try {

			Response response = client.newCall(request).execute();

			if (!response.isSuccessful()) {
				throw new IOException("Unexpected code " + response);
			}
			if (response.isSuccessful()) {
				String response1 = response.body().string().toString();
				JSONObject json = new JSONObject(response1);
				properties.setProperty("q88.APiVersionNumber", json.get("versionNumber"));
				properties.save();

			}

		} catch (SocketTimeoutException expected) {
			logger.error("Exception occurred in Q88 Integration Application Api Version exception " +expected);
			getApiVersion();
		} catch (Exception e) {
			logger.error("Exception occurred in Q88 Integration Application Api Version exception " +e);
		}
		return null;
	}

	public static void main(String[] args) throws Exception {

		ApiVersion obj = new ApiVersion();
		obj.getApiVersion();

	}
}

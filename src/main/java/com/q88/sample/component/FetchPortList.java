package com.q88.sample.component;



import java.io.IOException;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class FetchPortList {
	
	public static void main(String[] args) throws Exception {
		
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		
		 OkHttpClient client = new OkHttpClient();
		 String token = properties.getProperty("q88.token.access_token").toString();
		 String url = "https://webapi.q88.com/ReferenceData/GetPortList";
		 Request request = new Request.Builder()
				 			.url(url)
				 			.addHeader("Authorization", "Bearer "+token)
				 			.build();
		try {
			
			Response response = client.newCall(request).execute();
			
			 if (!response.isSuccessful()){
	             throw new IOException("Unexpected code " + response);
	          }

	         System.out.println("Server: " + response.body().string().toString());
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
}

}
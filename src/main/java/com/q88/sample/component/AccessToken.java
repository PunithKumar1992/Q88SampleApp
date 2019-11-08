package com.q88.sample.component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONObject;
import org.springframework.stereotype.Component;


@Component(value ="AccessToken")
public class AccessToken {
	
	public int getAccessToken() throws Exception {
		URL url = new URL("https://webapi.q88.com/Authenticate/Login");
		Map<String,Object> params = new LinkedHashMap<>();
        params.put("client_id", "WebApiVmsProduction");
        params.put("client_secret", "DBA610E42E0C8CAA2AEE9687B3224B9E0B35B0014C095322A15F3E48DA63468B93A7E07F3ECDDEE1592285624E365F56E7C49261F080AE4A");
        params.put("grant_type", "password");
        params.put("username", "gbabu");
        params.put("password", "Intlseas$123");
        
		
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");
        
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        int code = conn.getResponseCode();
        

        /*for (int c; (c = in.read()) >= 0;)
        System.out.print((char)c);*/
        
        String inputline;
		StringBuffer response = new StringBuffer();
		while((inputline = in.readLine())!=null) {
			response.append(inputline);
		}
		in.close();
		
		JSONObject json = new JSONObject(response.toString());
		
		  PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		  properties.setProperty("q88.token.access_token",json.get("access_token").toString());
		  properties.setProperty("q88.token.refresh_token",json.get("refresh_token").toString());
		  properties.setProperty("q88.token.token_type",json.get("token_type").toString());
		  properties.setProperty("q88.token.expires_in",json.get("expires_in").toString());
		  properties.setProperty("q88.token.client_id",json.get("as:client_id").toString());
		  properties.setProperty("q88.token.issued",json.get(".issued").toString());
		  properties.setProperty("q88.token.expires",json.get(".expires").toString());
		  properties.save();
		  
		  return code;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		AccessToken obj = new AccessToken();
		obj.getAccessToken();
		
	}

	
	
	
}

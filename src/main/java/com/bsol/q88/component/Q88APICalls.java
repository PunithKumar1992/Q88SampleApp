package com.bsol.q88.component;



import java.io.IOException;
import java.net.SocketTimeoutException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bsol.q88.model.Q88_PortList;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_Voyage;
import com.bsol.q88.service.Q88PortListService;
import com.bsol.q88.service.Q88TcOutListService;
import com.bsol.q88.service.Q88VoyageObjectService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


//@Component
//@EnableScheduling
public class Q88APICalls {

@Autowired
private AccessToken token;

@Autowired
private RefreshToken refreshtoken;


@Autowired
private Q88VoyageObjectService voyageService;





	
		@Scheduled(cron = "0 */1 * ? * *")
		void checkTokenExpires() throws Exception {
			
	    	PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
	    	final Date currentTime = new Date();
			final DateFormat dateformat  = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
			dateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
			String sysTime = dateformat.format(currentTime);
			String q88Expires = properties.getProperty("q88.token.expires").toString();
			String subq88= q88Expires.substring(1, 26);
			
			final DateFormat format  = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
			Date sysDate = format.parse(sysTime);
			Date q88Date = format.parse(subq88);
			
			if(sysDate.getDate() == q88Date.getDate()) {
			
			if(sysDate.before(q88Date))
			{
				//getPortLists();
				getvoyage();
				//getTcOutList();
			}
			else if(sysDate.after(q88Date)) {
				
				refreshtoken.getAccessTokenByRefreshToken();
				//getPortLists();
				 getvoyage();
				//getTcOutList();
			}
				   
			 }
			 else {
				 token.getAccessToken();
				 //getPortLists();
				 getvoyage();
				 //getTcOutList();
				 
			 }
			   
	    }
	
	
	
	
	
	
	void getvoyage()throws Exception{
		
		
		JSONObject json1;
		List<Q88_Voyage> Q88source = new ArrayList<Q88_Voyage>();
		List<Q88_PortList> destination = new ArrayList<Q88_PortList>();
		List<Q88_PortList> difference = new ArrayList<Q88_PortList>();
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		
		 OkHttpClient client = new OkHttpClient();
		 client.setConnectTimeout(30, TimeUnit.SECONDS);
		 client.setReadTimeout(30, TimeUnit.SECONDS);
		 client.setWriteTimeout(30, TimeUnit.SECONDS);
		 String token = properties.getProperty("q88.token.access_token").toString();
		 String url = "https://webapi.q88.com/Voyage/GetVoyageObject?voyageId=C33E200DE88DB38F417C143075CF38E1";
		 Request request = new Request.Builder()
				 			.url(url)
				 			.addHeader("Authorization", "Bearer "+token)
				 			.build();        
		try {
			
			Response response = client.newCall(request).execute();
		
			 if (!response.isSuccessful()){
	             throw new IOException("Unexpected code " + response);
	          }
			json1= new JSONObject(response.body().string().toString()); 
			 Gson gson = new Gson();
			 System.out.println("before voyage object");
			  Q88_Voyage voyage = gson.fromJson(json1.toString(), Q88_Voyage.class);
			  System.out.println(voyage);
			voyageService.saveVoyageObjList(voyage);
			//Q88_Voyage q88Voyage = voyageService.getVoyageObject("C33E200DE88DB38F417C143075CF38E1", "CFDED89B095BD54C3C9FA770EF3A2C4E");
			  
			//System.out.println(q88Voyage);
			 System.out.println("save voyage object");
			  
			
		}
		catch (SocketTimeoutException expected) {
			getvoyage();
        }
		catch (Exception e) {
			 e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
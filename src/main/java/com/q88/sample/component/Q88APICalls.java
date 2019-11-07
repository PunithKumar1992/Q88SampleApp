package com.q88.sample.component;



import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.q88.sample.model.PortList;
import com.q88.sample.service.Q88PortListService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


@Component
@EnableScheduling
public class Q88APICalls {

@Autowired
private AccessToken token;

@Autowired
private RefreshToken refreshtoken;

@Autowired
private Q88PortListService portService;

	
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
			}
			else if(sysDate.after(q88Date)) {
				
				refreshtoken.getAccessTokenByRefreshToken();
				//getPortLists();
			}
				   
			 }
			 else {
				 token.getAccessToken();
				 //getPortLists();
				 
			 }
			   
	    }
	
	void getPortLists()throws Exception {
		JSONArray json1;
		List<PortList> Q88source = new ArrayList<PortList>();
		List<PortList> destination = new ArrayList<PortList>();
		List<PortList> difference = new ArrayList<PortList>();
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
			
			System.out.println(response.code());
			
			 if (!response.isSuccessful()){
	             throw new IOException("Unexpected code " + response);
	          }

	        // System.out.println("Server: " + response.body().string().toString());
			 json1= new JSONArray(response.body().string().toString()); 
			 Gson gson = new Gson(); 
			 for(int i=0; i<json1.length(); i++) { 
				 PortList port =gson.fromJson(json1.getJSONObject(i).toString(), PortList.class);
				 Q88source.add(port);
			 }
			 destination = portService.getAllPorList();
			 difference = portListFilter(Q88source, destination);
			 
			 //System.out.println("difference "+difference);
			  for(PortList list: difference)
			  {
				  System.out.println("inside for loop");
				  System.out.println(list.getPortId());
				  portService.savePortList(list);
			  }
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
	
}
	
	public List<PortList> portListFilter(List<PortList> list1 , List<PortList>list2){

		  List<PortList> res1 = list1.stream().filter(o1 -> list2.stream().noneMatch(o2
				  -> o2.equals(o1))) .collect(Collectors.toList());
		      return res1;
   }
	
	
	
	

}
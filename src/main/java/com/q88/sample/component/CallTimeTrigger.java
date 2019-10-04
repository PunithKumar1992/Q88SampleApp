package com.q88.sample.component;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.q88.sample.Q88SampleAppApplication;
import com.q88.sample.model.Employee;
import com.q88.sample.service.UserService;


@Component
public class CallTimeTrigger {
	
	@Autowired
	private UserService userservice;

	
	   @Scheduled(cron = "0/10 * * * * ?")
	   public void trigger() {
		    
			URL url;
			String json1string=null;
			List<Employee> source = new ArrayList<Employee>();
			try {
				url = new URL("http://localhost:8090/SpringbootReset/users");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String inputline;
				StringBuffer response = new StringBuffer();
				while((inputline = in.readLine())!=null) {
					response.append(inputline);
				}
				in.close();
				JSONArray json1 = new JSONArray(response.toString());
				//json1string = json1.toString();
				for(int i=0; i<json1.length(); i++) {
				    Employee emp = new Employee();
				    emp.setUser_id(json1.getJSONObject(i).getInt("user_id"));
				    emp.setUser_name(json1.getJSONObject(i).getString("user_name"));
				    emp.setUser_tech(json1.getJSONObject(i).getString("user_tech"));
				    source.add(emp);
				}
				//System.out.println("listdata1 is " +listdata1);
				//System.out.println("json1 Restapi Response  is " +json1);
				//System.out.println("json1 Restapi String Response is " +json1string);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List<Employee> destination = userservice.getAllUsers();
			//System.out.println("Listdata2 is "+listdata2);
			//JSONArray json2 = new JSONArray(listdata2);
			//String json2string = json2.toString();
			//System.out.println("json2 Database exists is " +json2);
			//System.out.println("json2 String " +json2string);
			
		
		  List<Employee> result = filter(source,destination);
		  System.out.println("result is " +result);
		 
			
			

			
		   
	   }
	   
	  
	   public List<Employee> filter(List<Employee> list1 , List<Employee>list2){
		
		
		
		
		/*
		 * List<Employee> res1 = list1.stream().filter(o1 -> list2.stream().noneMatch(o2
		 * -> o2.getUser_id()==(o1.getUser_id()))) .collect(Collectors.toList());
		 */
		 
		 

		
		/*
		 * List<Employee> res2 = list2.stream().filter(o1 -> list1.stream().noneMatch(o2
		 * -> o2.getUser_id()==(o1.getUser_id()))) .collect(Collectors.toList());
		 */
		 
		  List<Employee> res1 = list1.stream().filter(o1 -> list2.stream().noneMatch(o2
				  -> o2.equals(o1))) .collect(Collectors.toList());
		
		  
	
		      return res1;
		   
		   
		   
	   }
	   
	

}

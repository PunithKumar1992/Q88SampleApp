package com.bsol.q88.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.stereotype.Component;

@Component
public class CheckToken {
	
	
	String checkTokenExpires() throws Exception {
		
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
			return "before";
		}
		else if(sysDate.after(q88Date)) {
			
			return "after";
		}
			   
		 }
		
		
		return "expired";
		   
    }

}

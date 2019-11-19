package com.bsol.q88.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test1 {
	
	private final Logger logger = LoggerFactory.getLogger(Test1.class);
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		final Date currentTime = new Date();
		final DateFormat dateformat  = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss z");
		dateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
		String sysTime = dateformat.format(currentTime);
		String q88Expires = properties.getProperty("q88.token.expires").toString();
		String subq88= q88Expires.substring(1, 30);

		final DateFormat format  = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		format.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date sysDate = format.parse(sysTime);
		Date q88Date = format.parse(subq88);
	
		
		System.out.println("sysDate " +sysTime.toString());
		
		//System.out.println("q88 Date  " +q88Date.toString());
		
		if(sysDate.after(q88Date))
		{
			System.out.println("sysDate after Q88Date");
		}
		
		if(sysDate.before(q88Date))
		{
			System.out.println("sysDate before Q88Date");
		}
		
		
		
		
	}

}

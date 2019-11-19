package com.bsol.q88.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.configuration.PropertiesConfiguration;

public class Test {

	
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		 Date now = new Date(); 
		String systime = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss ", Locale.ENGLISH).format(now);	
		DateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		String q88Expires = properties.getProperty("q88.token.expires").toString();
		String subq88= q88Expires.substring(1, 26);
		
		Date q88date = format.parse(subq88);
		System.out.println("Q88 Date  " +q88date);
		
		Date sysDate = format.parse(systime);
		System.out.println("system date  " +sysDate);
		
		if(sysDate.after(q88date)){
            System.out.println("Sysdate is after Q88 Date");
        }

		if(sysDate.before(q88date)) {
			System.out.println("Q88date is after sysDate");
		}

		
		
		

		
		
		 
		   
		
		
		
	
		
		
		
	}
}

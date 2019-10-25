package com.q88.sample.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Test {

	
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		 Date now = new Date(); 
		String systime = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss ", Locale.ENGLISH).format(now);	
		DateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss ", Locale.ENGLISH);
		String q88Expires = properties.getProperty("q88.token.expires").toString();
		String subq88= q88Expires.substring(6, 26);
		String subsys = (String) systime.subSequence(6, 26);
		System.out.println(subsys);
		System.out.println(subq88);
		final DateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		final Date sysdate = fmt.parse(subsys);
		final Date q88date = fmt.parse(subq88);
		
		System.out.println(sysdate);
		System.out.println(q88date);
		
		
		
	}
}

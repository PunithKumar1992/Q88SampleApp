package com.bsol.q88.component;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.TimeZone;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CheckToken {
	
	Logger logger = Logger.getLogger(this.getClass());

	String checkTokenExpires() throws Exception {
		logger.info("Q88 Integration Application Check Token Started ");
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		String q88Expires;
		Calendar sysDate = null;
		Calendar q88Date = null;
		final SimpleDateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("GMT"));
		if (properties.getProperty("q88.token.expires") != null) {
			q88Expires = properties.getProperty("q88.token.expires").toString().replaceAll("^\\[|\\]$", "");
			sysDate = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			q88Date = Calendar.getInstance();
			q88Date.setTime(format.parse(q88Expires));
			
			logger.info("sysdate " + sysDate.get(Calendar.DAY_OF_MONTH));
			logger.info("q88date " + q88Date.get(Calendar.DAY_OF_MONTH));
			System.out.println("sysDate " +sysDate);
				
		}

		
		if (properties.getProperty("q88.token.access_token") == null
			|| sysDate.get(Calendar.DAY_OF_MONTH) != q88Date.get(Calendar.DAY_OF_MONTH)) {
			return "expired";
		}
		if (properties.getProperty("q88.token.access_token") != null
				&& sysDate.get(Calendar.DAY_OF_MONTH) == q88Date.get(Calendar.DAY_OF_MONTH)) {

			if (sysDate.before(q88Date)) {
				return "before";
			} else if (sysDate.after(q88Date)) {

				return "after";
			}

		}
		logger.info("Q88 Integration Application CheckToken is Successfully executed");
		return "expired";

	}

	
	public static void main(String[] args) throws Exception{
		
		CheckToken obj = new CheckToken();
		String res = obj.checkTokenExpires();
		System.out.println("result is " +res);
	}
}

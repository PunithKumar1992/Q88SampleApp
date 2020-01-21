package com.bsol.q88.component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CheckToken {

	String checkTokenExpires() throws Exception {
		
		Logger logger = Logger.getLogger(this.getClass());
		
		PropertiesConfiguration properties = new PropertiesConfiguration("src/main/resources/token.properties");
		final Calendar currentTime = Calendar.getInstance();
		final SimpleDateFormat dateformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		dateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
		String sysTime = dateformat.format(currentTime.getTime());
		String q88Expires = properties.getProperty("q88.token.expires").toString();
		String subq88 = q88Expires.substring(1, 26);

		final SimpleDateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		Calendar sysDate = Calendar.getInstance();
		sysDate.setTime(format.parse(sysTime));
		Calendar q88Date = Calendar.getInstance();
		q88Date.setTime(format.parse(subq88));
		logger.info("sysdate " + sysDate.get(Calendar.DAY_OF_MONTH));
		logger.info("q88date " + q88Date.get(Calendar.DAY_OF_MONTH));

		if (properties.getProperty("q88.token.access_token") == null || sysDate.get(Calendar.DAY_OF_MONTH) != q88Date.get(Calendar.DAY_OF_MONTH)) {
			return "expired";
		}
		if (properties.getProperty("q88.token.access_token") != null && sysDate.get(Calendar.DAY_OF_MONTH) == q88Date.get(Calendar.DAY_OF_MONTH)) {

			if (sysDate.before(q88Date)) {
				return "before";
			} else if (sysDate.after(q88Date)) {

				return "after";
			}

		}

		return "expired";

	}

}

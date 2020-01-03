package com.bsol.q88.component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class DateParse {
	
	
	public static void main(String[] args) {
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
		        .appendPattern("yyyy-MM-dd").toFormatter();
		
	       String now = LocalDateTime.now(ZoneOffset.UTC).format(formatter);
	       LocalDateTime now1 = LocalDateTime.parse(now);
	       System.out.println("sysDate " +now1);
	    }
	

}

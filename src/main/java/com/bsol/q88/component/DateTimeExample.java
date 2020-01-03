package com.bsol.q88.component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) {
		    LocalDateTime startTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		    for(int i=0;i<1000000000;i++) {
		    	
		    }
		    
		    LocalDateTime endTime = LocalDateTime.now(ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		    System.out.println("startTime " +startTime);
		    
		    System.out.println("endTime " +endTime);
		    
		    
	}
}

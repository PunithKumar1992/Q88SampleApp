package com.bsol.q88;



import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Q88SampleAppApplication {

	static Logger logger = Logger.getLogger(Q88SampleAppApplication.class);
	
	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(Q88SampleAppApplication.class, args);
		
		logger.info("Q88 Integration application main class is started successfully !!!!!");
	}

}

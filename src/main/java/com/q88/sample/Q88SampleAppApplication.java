package com.q88.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.q88.sample.component.AccessToken;

@SpringBootApplication
@EnableScheduling
public class Q88SampleAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Q88SampleAppApplication.class, args);
	
	}

}

package com.q88.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.q88.sample.component.AccessToken;

@SpringBootApplication
@EnableScheduling
public class Q88SampleAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Q88SampleAppApplication.class, args);
	
=======
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Q88SampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Q88SampleAppApplication.class, args);
>>>>>>> branch 'master' of https://github.com/PunithKumar1992/Q88SampleApp.git
	}

}

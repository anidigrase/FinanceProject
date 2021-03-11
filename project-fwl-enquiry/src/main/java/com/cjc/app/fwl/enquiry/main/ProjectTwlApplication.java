package com.cjc.app.fwl.enquiry.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectTwlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTwlApplication.class, args);
	}

}

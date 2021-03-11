package com.cjc.app.fwl.enquiry.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectTwlModelCustomerDocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTwlModelCustomerDocsApplication.class, args);
	}

}

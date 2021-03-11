package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicesServerApplication {

	public static void main(String[] args) {

		System.out.println("Eureka Server Started--------------");
		SpringApplication.run(MicroServicesServerApplication.class, args);
	}

}

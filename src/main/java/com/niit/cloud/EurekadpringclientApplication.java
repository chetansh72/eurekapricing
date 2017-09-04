package com.niit.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekadpringclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadpringclientApplication.class, args);
	}
}

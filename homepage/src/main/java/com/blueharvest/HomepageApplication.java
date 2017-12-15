package com.blueharvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HomepageApplication {

	public static void main(String[] args) {
        Thread.currentThread().setName("Homepage");
		SpringApplication.run(HomepageApplication.class, args);
	}
	
}

package com.blueharvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		Thread.currentThread().setName("ApiGateway");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
}

package com.blueharvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.blueharvest.controller.ClientController;
import com.blueharvest.controller.ClientControllerPlain;

@SpringBootApplication
//@EnableDiscoveryClient
public class HomepageClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomepageClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public ClientController clientController() {
		ClientController clientController = new ClientController();
		clientController.setServiceUrl("http://homepage");
		return clientController;
	}
	
	@Bean
	public RestTemplate restTemplatePlain() {
		return new RestTemplate();
	}
	
	@Bean
	public ClientControllerPlain clientControllerPlain() {
		ClientControllerPlain clientControllerPlain = new ClientControllerPlain();
		clientControllerPlain.setServiceUrl("http://192.168.99.100:8070/api/homepage");
		return clientControllerPlain;
	}

}

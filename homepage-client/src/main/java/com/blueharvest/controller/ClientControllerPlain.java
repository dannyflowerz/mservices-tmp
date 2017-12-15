package com.blueharvest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Setter;

@RestController
public class ClientControllerPlain {

	@Autowired
	@Qualifier("restTemplatePlain")
	private RestTemplate restTemplate;
	@Setter private String serviceUrl;
	
	@GetMapping("/plainping")
	public String ping() {
		return restTemplate.getForObject(serviceUrl + "/ping", String.class);
	}
	
}

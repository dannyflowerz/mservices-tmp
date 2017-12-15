package com.blueharvest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<ServiceInstance> services() {
        return discoveryClient.getInstances("homepage");
    }

    @GetMapping("/ping")
    public String ping() {
        return String.format("%s: pong!", this.hashCode());
    }
    
}

package com.gateway.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping(value = "/")
	public Map<String,Object> gatewayHome(){
		Map<String,Object> response = new LinkedHashMap<>();
		
		response.put("Message ","Welcome to API Gateway" );
		response.put("Description", "use /api/customer or /api/address to access microservices");
		response.put("totalServices",discoveryClient.getServices().size());
		
		Map<String,List<String>> serviceMap = new LinkedHashMap<>();
		
		discoveryClient.getServices().forEach(serviceName -> {
			List<String> instances = new ArrayList<>();
			
			discoveryClient.getInstances(serviceName).forEach(instance ->{
				instances.add(instance.getUri().toString());
			});
			serviceMap.put(serviceName, instances);
		});

		response.put("registeredServices", serviceMap);
		
		return response;
	}

}

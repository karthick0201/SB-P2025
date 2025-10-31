package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
public class SbRest08MicroserviceApiGatewayApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbRest08MicroserviceApiGatewayApplication.class, args);
	}
	@Autowired
	private Environment environment;
	
	@Override
	public void run(String... args) throws Exception {
		String message = environment.getProperty("message");
		
		System.out.println("\n\n\n\n>>---------------------------------<<\n\n");
		System.out.println(">>----|| Message : " + message);
		System.out.println("\n\n\n\n>>---------------------------------<<\n\n");
		
	}
}

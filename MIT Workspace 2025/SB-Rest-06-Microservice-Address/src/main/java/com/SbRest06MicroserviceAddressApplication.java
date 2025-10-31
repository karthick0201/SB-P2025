package com;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
public class SbRest06MicroserviceAddressApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbRest06MicroserviceAddressApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
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

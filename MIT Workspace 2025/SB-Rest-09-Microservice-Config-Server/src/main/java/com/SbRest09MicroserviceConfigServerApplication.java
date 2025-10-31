package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SbRest09MicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbRest09MicroserviceConfigServerApplication.class, args);
	}

}

package com;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "REST API DEVELOPMENT",
		version = "1.0.1",
		termsOfService = "ALL RIGHTS ARE RECEIVED",
		description = "Developed Rest api and pagination, xml and json , swagger praticed.",
		contact = @Contact(name = "karthick0201", email = "karthick@test.com", url = "kapi.com"),
		license = @License(name = "karthickcdp",url = "karthick.cdp.com")
		))
public class RestMiniProject {

	public static void main(String[] args) {
		SpringApplication.run(RestMiniProject.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}

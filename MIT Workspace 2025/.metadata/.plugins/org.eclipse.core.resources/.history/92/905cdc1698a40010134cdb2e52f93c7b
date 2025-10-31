package com.mit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@Autowired
	Environment environment;
	/*
	 * Profiles
	 * 
	 * 	There are 3 ways we can activates the profile
	 * 
	 * 	1. Application.properties
	 * 		spring.profiles.active=dev
	 * 	2. SpringApplication.
	 * 	3. 
	 * 
	 * */
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(">>----| Profiles Concept Pratice |-------<<");
		
		String[] activeProfiles = environment.getActiveProfiles();
		
		System.out.println("ActiveProfiles : " + Arrays.toString(activeProfiles));
		
		String userName = environment.getProperty("database.username");
		String password = environment.getProperty("database.password");
		String email = environment.getProperty("application.emails");
		
		System.out.println("User Name : " + userName);
		System.out.println("Password  : " + password);
		System.out.println("Email     : " + email);
		
		System.out.println(">-----------------------------------------<");
		
		
	}

}

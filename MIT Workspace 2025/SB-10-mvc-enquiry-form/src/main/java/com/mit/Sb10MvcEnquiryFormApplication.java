package com.mit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb10MvcEnquiryFormApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sb10MvcEnquiryFormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>----| Spring boot Web MVC |------<<<");
		
		
		System.out.println(">>-----------------------------------<<");
	}

}

package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbSecurity03LoginRegisterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbSecurity03LoginRegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n\n>>-------| Spring Security Login and Register |------------<<\n\n\n");
		
	}

}

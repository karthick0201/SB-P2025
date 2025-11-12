package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbSecurity04JwtTokenLoginRegisterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbSecurity04JwtTokenLoginRegisterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n\n>>---------------------------<<");
		System.out.println(">>------| JWT TOKEN |--------<<");
		System.out.println(">>---------------------------<<\n\n\n");
		
	}

}

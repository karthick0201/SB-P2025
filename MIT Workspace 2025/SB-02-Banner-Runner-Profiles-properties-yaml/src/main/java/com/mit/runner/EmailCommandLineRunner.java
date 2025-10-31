package com.mit.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("<~~~~~~~~~~~~ EmailCOmmandLineRunner Start...");
		System.out.println("Args : " + Arrays.toString(args));
		System.out.println("<~~~~~~~~~~~~ EmailCOmmandLineRunner End...");
		
		

	}

}

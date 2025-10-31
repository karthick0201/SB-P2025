package com.mit.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCommandLineRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("<~~~~~~~~~~~~ TestCommandLineRunner - Run Method Called!!!");
		
		System.out.println("Run MEthods ARGS : " + Arrays.toString(args));

		
		

	}

}

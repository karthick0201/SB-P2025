package com.mit.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {


	public ProdConfig() {
		System.out.println(">---| Production Config Constructor Called...");
	}
}

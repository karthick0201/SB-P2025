package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SbSecurity02ConsumerApplicationWebclientRestTemplateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbSecurity02ConsumerApplicationWebclientRestTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		gettingResponseUsingRestTemplate();
		
		getttingResponseUsingWebClient();
		
		
	}

	private void getttingResponseUsingWebClient() {
		
		
	}

	private void gettingResponseUsingRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:1122/api/transfer";

		HttpHeaders requestHeader = new HttpHeaders();
		requestHeader.setBasicAuth("karthick", "cdp");

		HttpEntity<String> reqeustEntity = new HttpEntity<>(requestHeader);

		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, reqeustEntity, String.class);

		linePrint();
		System.out.println("URL : " + url);
		System.out.println("Response : " + responseEntity.getBody());
		linePrint();

	}

	private void linePrint() {
		System.out.println("\n\n>>---------------------------------<<\n\n");
		
	}

}

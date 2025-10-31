package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.consumer.HttpClientAPIPratice;
import com.consumer.RestClientTemplatePratice;
import com.consumer.WebClientPratice;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class SbRest04RestClientConsumerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbRest04RestClientConsumerApplication.class, args);
	}
	
	
	@Autowired
	private RestClientTemplatePratice restClientPratice;
	
	@Autowired
	private WebClientPratice webClient;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>--------| CONSUMER APPLICATION |----------<<");
		
		HttpClientAPIPratice httpClientPratice = new HttpClientAPIPratice();
		//httpClientPratice.httpClientPratice();
		
		//RestClientTemplatePratice restClientPratice = new RestClientTemplatePratice();
		//restClientPratice.restClientPratice();
	
		/* WebClient Pratice */
		webClient.webClientPratice();
		
		
		
		System.out.println(">>------------------------------------------<<");
		
		
	}

}

package com.controlelr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MessageController {
	
	
	@GetMapping(value = "/message")
	public String message() {
		
		return "Hey Peter!!!";
	}
	
	@GetMapping(value = "/about-us")
	public String aboutUs() {
		return "We are Avengers...";
	}
	
	@GetMapping(value = "/transfer")
	public String transfer() {
		return "Now on you are not Avengers...";
	}

	@GetMapping(value = "/balance")
	public String balance() {
		return "Vision only Left...";
	}
	

}

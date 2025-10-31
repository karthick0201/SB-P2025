package com.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // ==> @Controller + @ResponseBody
@RequestMapping(value = "/api/login")
public class LoginResource {

	
	
	@GetMapping("/validate")
	public ResponseEntity<String> validate(
								@RequestParam("username") String username,
								@RequestParam("password") String password){
		
		/* 1. Null Check */
		if(username == null || password == null) {
			return new ResponseEntity<String>("Username Or Password can't be Null!!!",HttpStatus.OK);
		}
		
		/* 2. Authication */
		
		if("karthick0201".equals(username) && "cdp@123".equals(password)) {
			return new ResponseEntity<String>("Valid User!", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Username or Password Incorrect", HttpStatus.OK);
		}
		
	}
}

package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@PostMapping("/register")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		
		boolean status = customerService.saveCustomer(customer);
		
		if(!status) {
			return new ResponseEntity<String>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		
		return new ResponseEntity<>(customerService.getAllCustomer(),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Customer customer){
		UsernamePasswordAuthenticationToken token = 
						new UsernamePasswordAuthenticationToken(customer.getEmail(), customer.getPassword());
		
		System.out.println(">----| Login Controller Landed!!! " + customer);
		Authentication auth = authManager.authenticate(token);
		
		boolean status = auth.isAuthenticated();
		
		System.out.println("Login Status : " + status);
		if(!status) {
			return new ResponseEntity<String>("FAILED",HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		
	}
	
	
}

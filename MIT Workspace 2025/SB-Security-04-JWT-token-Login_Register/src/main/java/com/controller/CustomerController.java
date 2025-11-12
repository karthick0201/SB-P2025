package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.service.JWTService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JWTService jwtService;
	
	@PostMapping(value = "/register")
	public ResponseEntity<String> registerCustomer(@RequestBody Customer customer){
		
		boolean status = customerService.registerCustomer(customer);
		
		if(!status) {
			return new ResponseEntity<String>("FAILED",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("SUCCESS",HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> login(@RequestBody Customer customer) {
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(customer.getEmail(),
				customer.getPassword());

		Authentication auth = authManager.authenticate(token);

		boolean status = auth.isAuthenticated();
		
		if (!status) {
			return new ResponseEntity<String>("Invalid Credentials", HttpStatus.BAD_REQUEST);
		}

		String jwtToken = jwtService.generateToken(customer.getEmail());
		
		Map<String,String> map = new HashMap<>();
		map.put("token", jwtToken);
		
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		System.out.println(">>Landed CustomerGetAllCustomer Method .......");
		return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("WELCOME",HttpStatus.OK);
	}
	

}

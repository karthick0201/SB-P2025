package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	public EmployeeController() {
		System.out.println("~~~~~~~~~~~~~~~~~~~> Employee COntroller - Default Constructor called!!!");
	}
	
	@ResponseBody
	@RequestMapping("/home")
	public String homePage() {
		
		return "Hey Employeee!!!!";
	}
}

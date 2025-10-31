package com.spring.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dto.UserLoginDTO;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@RequestMapping("/")
	public String homePage() {
		System.out.println("LOading Home Page!!!");
		return "welcome-page";

	}

	@RequestMapping("/login")
	public String loginPage(@ModelAttribute("userLoginDTO") UserLoginDTO uld) {

//		uld.setcName("J");
//		uld.setuName("k");

		System.out.println("UserLoginDTO Object : " + uld);
		return "login-page";
	}

	@RequestMapping("/resultpage")
	public String resultPage(@Valid @ModelAttribute("userLoginDTO") UserLoginDTO uld,BindingResult serverValidation) {
		System.out.println("ResultPage() Method!!! : " + uld);
		if(serverValidation.hasErrors()) {
			return "login-page";
		}
		return "result-page";
	}

	/*
	 * @InitBinder Annotation - this method will execute first every request
	 * 
	 * Example 1 : 
	 * 
	 * I dont want to bind one field value.
	 * how to handle?
	 * 	Using @InitBinder
	 */
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		//1. Set Not allowed Field
		//webDataBinder.setDisallowedFields("uName");
		// 2.  empty space remove
		
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true); // true - remove emptyspace , false = set null if empty
		webDataBinder.registerCustomEditor(String.class, "uName", trimmerEditor);
		
	}

}

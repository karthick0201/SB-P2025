package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dto.UserDTO;
import com.spring.validator.AgeValidator;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@RequestMapping("/")
	public String welcomePage() {
		return "welcome-page";
	}

	@RequestMapping("register")
	public String registerPage(@ModelAttribute("userDTO")UserDTO rdto) {
		
		return "register-page";
	}

	@RequestMapping("result")
	public String resultPage(@Valid @ModelAttribute("userDTO")UserDTO rdto,BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()) {

			System.out.println(">>-------< BindingResult Errors >-------<<");
			bindingResult.getAllErrors().
				forEach(oe -> System.out.println(oe));
			System.out.println(">>--------------------------------------<<");
			
			
			return "register-page";
		}
		
		
		return "result-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		// register Age Validator with webDataBinder
		dataBinder.addValidators(new AgeValidator());
		
	}
	
}

package com.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validation.dto.LoveCalculatorDTO;

import jakarta.validation.Valid;

@Controller
public class UserController {

	
	@RequestMapping("/")
	public String reception() {
		return "home";
	}
	
	@RequestMapping("home")
	public String home(@ModelAttribute("loveCalDto") LoveCalculatorDTO loveCalDto) {
		
		return "user-form";
	}

	@RequestMapping("result")
	public String result(@Valid @ModelAttribute("loveCalDto") LoveCalculatorDTO loveCalDto, BindingResult errorResult) {
		
		if (errorResult.hasErrors()) {
			return "user-form";
		}
		return "result";
	}
}

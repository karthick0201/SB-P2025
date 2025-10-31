package com.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.dto.LoginDTO;
import com.lc.dto.RegDTO;
import com.lc.service.dao.LoveCalculatorDAO;

@Controller
public class HomeController {
	
	@Autowired
	private LoveCalculatorDAO lc;
	
	@RequestMapping("/")
	public String welcomePage() {
		System.out.println("<<<Inside WelcomePage()>>>");
		return "welcome-page";
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute("loginDTO") LoginDTO loginDto) {

		System.out.println("<<<Inside login() Method>>>");
		return "login-page";
	}

	@RequestMapping("/register")
	public String regPage(@ModelAttribute("regDTO") RegDTO regDto) {

		System.out.println("<<<Inside regPage() Method>>>");
		return "reg-page";
	}
	
	@RequestMapping("/register-success")
	public String regPageSuccess(@ModelAttribute("regDTO") RegDTO regDto) {
		System.out.println("<<<Inside regPageSUccess() Method>>>");
		System.out.println("Print : " + regDto);
		
		int registerUser = lc.registerUser(regDto);
		
		System.out.println("Update : " + registerUser + "\n Success!!!");
		
		
		return "reg-success";
	}
}

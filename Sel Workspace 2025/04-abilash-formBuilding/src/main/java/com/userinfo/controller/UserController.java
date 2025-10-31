package com.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.userinfo.dto.UserInfoDTO;

@Controller
public class UserController {

	public UserController() {
		System.out.println("~~~~~~~~~~> UserController - Class - Default COnstructor...");
	}
	@RequestMapping("/")
	public String reception() {
		return "home";
	}
	
	@RequestMapping("/home")
	public String home(@ModelAttribute("userInfoDto") UserInfoDTO userInfoDto) {
		
		return "user-form";
	}
	
	@RequestMapping("/submit")
	public String submit(@ModelAttribute("userInfoDto")UserInfoDTO userInfoDto) {
		
		System.out.println("UserInfoDTO : " + userInfoDto );
		
		return "submit";
	}
	
}

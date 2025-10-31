package com.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/wishes")
	public ModelAndView home( ) {
		
		String message = "Welcome To Our WebPage";
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("Message",message);
		System.out.println(">> Labded Home Controller...");

		return mav;
	}
	
}

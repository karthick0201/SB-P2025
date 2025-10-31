package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping("/suger")
	public String giveSugar() {
		return "From Mom : take it Sugar!!";
	}
	
	@ResponseBody
	@RequestMapping("/ps4")
	public String givePS4() {
		return "From Son : Take it PS4";
	}

	@ResponseBody
	@RequestMapping("/makeupkit")
	public String giveMakeupKit() {
		return "From Sis : take it MakeupKit";
	}
	
	
}

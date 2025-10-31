package com.track.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

	
/*
	@RequestMapping("path-first")
	public String pathFirst(Model model,HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		
		Arrays.stream(cookies).forEach(c ->{
			System.out.println(">>>cookie : " + c.getName() + " || " + c.getValue());
			if(c.getName().equals("labtop.name")){
				String value = c.getValue();
				model.addAttribute("labtopName",value);
				
			}
		});
		
		return "path-first";
	}
	*/
	
	/*Below We used springs @cookievalue above, we used legacy way*/
	@RequestMapping("path-first")
	public String pathFirst(@CookieValue("labtop.name")String value,Model model,HttpServletRequest req) {
		
		if(value.equals("labtop.name")){
			model.addAttribute("labtopName",value);
		}
		System.out.println("@Cookie value Annotation : " + value);
		return "path-first";
	}
	@RequestMapping("path-second")
	public String pathSecond(Model model,@RequestParam Map<String,String> formInfo,HttpServletResponse response) {
		
		
//		String modelName = "";
		AtomicReference<String> modelName = new AtomicReference<>("");

		System.out.println(">----> RequestParam Map <-------<");
		formInfo.forEach((k,v) ->{
			System.out.println(k + " |:| " + v);
			model.addAttribute(k,v);
			if(k.equals("labtopName")) {
				modelName.set(v);
			}
			
		});
		System.out.println(">--------------------------------<");
		
		Cookie c = new Cookie("labtop.name", modelName.get());
		c.setMaxAge(78*98*58); // in seconds
		c.setPath("/");
		response.addCookie(c);
		
		return "path-second";
	}
	
	@RequestMapping("/")
	public String home() {
		return "welcome-page";
		
	}
	
	@RequestMapping("/cookie-first")
	public String cookieFirst() {
		return "cookie-first";
	}
	
	@RequestMapping("/cookie-second")
	public String cookieSecond() {
		return "cookie-second-page";
	}
	
}

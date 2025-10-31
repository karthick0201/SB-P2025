package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.spring.dto.FeedbackDTO;
import com.spring.dto.UserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@RequestMapping("/")
	public String home() {
		return "home-page";
	}

	@RequestMapping("/feedback-form")
	public String feedbackPage(Model model, FeedbackDTO feedbackDTO,HttpSession session) {
		
		System.out.println("feedback DTO : " + feedbackDTO);
		model.addAttribute("feedbackDTO",feedbackDTO);
		
		//adding userobject to session
		session.setAttribute("name", getUserDTO());
		return "feedback-form";
	}
	public UserDTO getUserDTO() {
		UserDTO dto = new UserDTO();
		dto.setName("Karthick");
		dto.setNationality("India");
		dto.setAddress("Tamil Nadu");
		return dto;
	}
	
	public FeedbackDTO getFeedbackDTO() {
		return new FeedbackDTO();
	}
	
	
}

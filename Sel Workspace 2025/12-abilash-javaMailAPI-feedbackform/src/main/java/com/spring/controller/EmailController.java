package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dto.FeedbackDTO;
import com.spring.service.IEmailService;

@Controller
public class EmailController {

	@Autowired
	private IEmailService emailService;
	
	@RequestMapping("/send-email")
	public String sendEmail(FeedbackDTO feedbackDTO, Model model) {
		
		System.out.println("~~~~~~~~~~~~Send-Email COntroller....");
		
		System.out.println(feedbackDTO);
		boolean emailStatus = emailService.sendEmail(feedbackDTO.getEmail(), feedbackDTO.getFeedbackMessage());
		
		model.addAttribute("status",emailStatus);
		
		return "redirect:/success";
	}
	
	@RequestMapping("/success")
	public String success() {
		return "success-page";
	}
}

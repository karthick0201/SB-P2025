package com.track.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.track.dto.RegisterDTO;

@Controller
@SessionAttributes("registerDTO")
public class SessionController {

	
	@ModelAttribute("registerDTO")
	public RegisterDTO getRegisterDTO() {
	    return new RegisterDTO(); // or preload with default values
	}

	
	@RequestMapping("/first-page") // register form
	public String registerPage(Model model,@ModelAttribute RegisterDTO registerDTO) {
			
		
//		model.addAttribute("registerDTO",registerDTO);
		model.addAttribute("next","second-page");
		// Here - predefined data we can provide...
		
		return "first-page";
	}
	
	@RequestMapping("/second-page") // after submitting here come
	public String secondPage(RegisterDTO registerDTO,Model model) {
		
//		session.setAttribute("regDTO", registerDTO);
		
		model.addAttribute("registerDTO",registerDTO);
		model.addAttribute("next","third-page");

		
		// Here if we add to session object, it will available until session destroyed
		
		return "second-page";
	}
	
	@RequestMapping("/third-page")
	public String thirdPage( ) {
		
		return "third-page";
	}
	
	@RequestMapping("/logout-session")
	public String logoutSession(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/first-page";
	}
	
	
}

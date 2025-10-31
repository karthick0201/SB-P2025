package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dto.CommunicationDTO;
import com.spring.dto.PhoneDTO;
import com.spring.dto.UserInfoDTO;

@Controller
public class UserController {

	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/user-form")
	public String userForm(@ModelAttribute("userInfoDto") UserInfoDTO userInfoDto) {
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		PhoneDTO phoneDTO = new PhoneDTO();
		phoneDTO.setPhoneNo("987456321");
		phoneDTO.setCountryCode("91");
		communicationDTO.setPhone(phoneDTO);
		userInfoDto.setCommunicationDto(communicationDTO);
		
		return "user-form";
	}
	
	@RequestMapping("/result")
	public String result(@ModelAttribute("userInfoDto") UserInfoDTO userInfoDto) {
		
		return "result";
	}
}

package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

	@RequestMapping("/mail-send")
	public String sendMail() {
		return "mail-home";
	}

	@RequestMapping("/mail-result")
	public String successMail() {
		return "mail-result";
	}
}

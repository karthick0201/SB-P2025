package com.form.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.form.dto.SurveyDto;

@Controller
public class UserController {

	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/user-form")
	public String userForm(@ModelAttribute("surveyDto")SurveyDto surveyDto) {
		
		return "user-form";
	}
	
	@RequestMapping("/result")
	public String result(@Valid @ModelAttribute("surveyDto")SurveyDto surveyDto,BindingResult validationErrorResult) {
		
		List<ObjectError> allErrors = validationErrorResult.getAllErrors();
		System.out.println(">-----> All ERRORs <--------<");
		
		allErrors.forEach(val -> System.out.println(val));
		System.out.println(">--------------------------------<");
		if(validationErrorResult.hasErrors()) {
			System.out.println("Annotation - Validation Error  ::: ...");
			return "user-form";
			
		}
		
		return "result";
	}
}

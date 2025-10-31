package com.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lc.dto.LoveCalculatorDTO;
import com.lc.service.LoveService;

@Controller
public class LoveCalculatorController {

	@Autowired
	private LoveService loveService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		
		return "Hey Love Calculator!!!! ";
	}
	
	//@RequestMapping("/home")
	public String home() {
		
		return "love-calculator";
	}

	
	
	/*
	 * 
	 * Learning 1 : We used requestParam Annotation to get form data.
	 * 
	 * disadvantages : 
	 * 		if 100 params present nah, i want add 100 @RequestParam annoations in the param.
	 * 
	 * Overcome : DTO class - Data Transfer Object
	 * 
	 * 		using this spring automatically bind form data to dto object. based on property name and form name.
	 * 
	 * */
//	@RequestMapping("/calculate")
	public String calculate(@RequestParam("yourName")String yourName,
							@RequestParam("crushName")String crushName, Model model) {
		
		System.out.println("yourName : " + yourName);
		System.out.println("crushName : " + crushName);

		
		String result = loveService.calculateLove(yourName, crushName);
		System.out.println("Result : " + result);
		model.addAttribute("yourName",yourName);
		model.addAttribute("crushName",crushName);
		model.addAttribute("result",result);
		
		return "result";
	}
	/* if 100 Params came - over come that problem, pass a dto object */
	//@RequestMapping("/calculate")
	public String calculate(LoveCalculatorDTO loveCalDTO, Model model) {
		System.out.println("<>---------< DTO EXAMPLE >------------<>");
		
		String result = loveService.calculateLove(loveCalDTO.getYourName(), loveCalDTO.getCrushName());

		model.addAttribute("loveCalDto",loveCalDTO);
		model.addAttribute("result",result);
		
		return "result";
	}
	
	/*
	 * 3. Above what we did? 
	 * 		Getting form data from dto and adding to model object.
	 * 		- We can do same thing using @ModelAttribute
	 * 
	 * */
	
	@RequestMapping("/calculate")
	public String calculateAnnoExample(@ModelAttribute("loveCalDto") LoveCalculatorDTO loveCalDto, Model model) {

		String result = loveService.calculateLove(loveCalDto.getYourName(), loveCalDto.getCrushName());
		
		model.addAttribute("result",result);
		
		return "result";
	}
	
	
	
	/*4. Data binding  and Two way databinding
	 * -> we going to use "Spring-MVC Form Tag"
	 * 
	 * Pre-Requcite: Using Spring MVC Form instead of jstl.
	 * 
	 * */
	
	
	@RequestMapping("/home")
	public String homeSpringMVCFormTag(@ModelAttribute("loveCalDto") LoveCalculatorDTO loveCalDto) {
		
		return "love-calculator-formtag";
	}
	
	
	
	
	
	
	
}

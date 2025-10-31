package com.lc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.dto.LoveCalDTO;
import com.lc.pojo.HistoryPojo;
import com.lc.service.dao.LoveCalculatorDAO;
import com.lc.service.lclogic.LoveCalService;

@Controller
public class LCController {

	@Autowired
	private LoveCalService loveCalService;
	
	@Autowired
	private LoveCalculatorDAO lcCalDao;
	
	@RequestMapping("/love-cal")
	public String welcomeUser(@ModelAttribute("loveCalDTO")LoveCalDTO lcDto) {
		System.out.println("<<<<WelcomeUser Method()>>>");
		
		return "lovecal-home";
	}
	
	@RequestMapping("/love-cal-result")
	public String loveCalResult(
			@ModelAttribute("loveCalDTO")LoveCalDTO lcDto,Model m,HttpSession hs) {
		System.out.println(">>>>>>LoveCalResult() Method<<<<<<<<");
		
		//1. Find Result (name,crushName)
		String result=loveCalService.calculateLogic(lcDto.getName(), lcDto.getCrushName());
		//2. Add result to model IN THE FORM OF OBJECT(HistoryPojo)
			//i. get username
			String userName = (String) hs.getAttribute("userNameSession");
			System.out.println("Session data2 : " + (String) hs.getAttribute("userNameSession"));
			//ii. get PrimaryKey by UserName
			int primaryKey=lcCalDao.getPrimaryKeyByUserName(userName);
			
			HistoryPojo hp=new HistoryPojo(primaryKey,lcDto.getName(),
					lcDto.getCrushName(),result);
			//iii. addtoModel
			m.addAttribute("historyPojo",hp);
			System.out.println("<<< HistoryPojo >>> "+ hp);
		//3. add history to database-History Table
			lcCalDao.addHistoryToDatabase(hp);
			System.out.println("History Added Successfull!!!");
		
		
		return "lovecal-result";
	}
	
}

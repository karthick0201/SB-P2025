package com.lc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.dto.LoginDTO;
import com.lc.pojo.HistoryPojo;
import com.lc.service.dao.LoveCalculatorDAO;
import com.lc.service.dao.LoveCalculatorDaoImp;

@Controller
public class LoginAfterController {
	@Autowired
	private LoveCalculatorDaoImp lc;
	
	@Autowired
	private LoveCalculatorDAO lcDao;
	
	@RequestMapping("/welcome-user")
	public String welcomeUser(@ModelAttribute("loginDTO")LoginDTO loginDto,HttpSession hs) {

		System.out.println("<<<<Welcome-user Method()>>>>>>>");
		System.out.println(loginDto);
		
		if(lc.validateUser(loginDto)) {
			
			System.out.println("Valid SUccess!!!welcomeUser()");
			
			hs.setAttribute("userNameSession",loginDto.getUserName());
			
			//System.out.println("Session Peint1 : " +  hs.getAttribute("userNameSession"));
			return "login-welcome";
		}else {
			
			System.out.println("Not Valid!!!>>>");
			return "login-page";
		}
		
	}
	
	@RequestMapping("/history")
	public String history(Model m,HttpSession hs) {
		System.out.println("\n\n>>>>History() Method<<<<<<<\n\n");
		
		String userName= (String)hs.getAttribute("userNameSession");
		List<HistoryPojo> records = lcDao.getRecords(userName);
		m.addAttribute("records",records);
		
		return "user-history";
	}
//	deleteHistory/${record.hid}"
	@RequestMapping("/deletehistory/{hid}")
	public String deleteHistory(@PathVariable int hid) {
		System.out.println(">>>>>>DeleteHistory() Method<<<<<<<");
		lcDao.deleteHistoryById(hid);
		return "redirect:/history";
	}
	
	
	
	@RequestMapping("/user-details")
	public String userDetails() {
		return "user-details";
	}
	
}

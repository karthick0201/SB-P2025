package com.lc.service;

import org.springframework.stereotype.Service;

@Service
public class LoveService {

	
	public String calculateLove(String yourName,String crushName) {
		int score = (yourName + crushName).length() % 5;
	    switch (score) {
	        case 0: return "Enemies";
	        case 1: return "Affair";
	        case 2: return "Just Friends";
	        case 3: return "Marriage";
	        default: return "Not Happening";
	    }
	}
	
	
}

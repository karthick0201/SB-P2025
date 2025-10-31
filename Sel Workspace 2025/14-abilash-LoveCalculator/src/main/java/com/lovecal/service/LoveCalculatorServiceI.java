package com.lovecal.service;

import java.util.List;

import com.lovecal.dto.LoginDTO;
import com.lovecal.dto.LoveCalculatorDTO;
import com.lovecal.dto.RegisterDTO;
import com.lovecal.pojo.HistoryPojo;
import com.lovecal.pojo.UserPojo;

public interface LoveCalculatorServiceI {

	boolean registerUser(RegisterDTO registerDto);

	boolean validateUser(LoginDTO loginDto);

	int calculateLovePercentage(String yourName, String crushName);

	public String calculateLove(int percentage);

	boolean saveLoveResult(HistoryPojo history, int userId);

	List<HistoryPojo> getHistory(int userId);

	UserPojo getUserByEmail(String email);
	
	public boolean deleteHistory(int historyId);

}

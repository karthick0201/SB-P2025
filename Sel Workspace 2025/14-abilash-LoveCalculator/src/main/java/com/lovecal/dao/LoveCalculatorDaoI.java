package com.lovecal.dao;

import java.util.List;

import com.lovecal.dto.LoginDTO;
import com.lovecal.pojo.HistoryPojo;
import com.lovecal.pojo.UserPojo;

public interface LoveCalculatorDaoI {
	

	public boolean fillDefaultdata();
	
	public boolean registerUser(UserPojo userPojo);
	
	public boolean validateUser(LoginDTO loginDto);
	
	// love calculator
	public List<HistoryPojo> getHistory(int id);
	
	public boolean saveLoveResult(HistoryPojo history);

	public UserPojo getUser(String email);
	
	public boolean deleteHistory(int historyId);

}

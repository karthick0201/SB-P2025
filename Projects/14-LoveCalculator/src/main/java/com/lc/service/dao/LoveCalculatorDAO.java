package com.lc.service.dao;

import java.util.List;

import com.lc.dto.LoginDTO;
import com.lc.dto.RegDTO;
import com.lc.pojo.HistoryPojo;
import com.lc.pojo.UserPojo;

public interface LoveCalculatorDAO {
	
	public UserPojo getUserObjectFromUserName(String userName) throws Exception;
	
	public boolean validateUser(LoginDTO loginDto);

	public int registerUser(RegDTO reg);
	
	public int getPrimaryKeyByUserName(String userName);
	
	/*History Add DB*/
	public int addHistoryToDatabase(HistoryPojo historyPojo);

	public List<HistoryPojo> getRecords(String userName);
	
	public boolean deleteHistoryById(int hid);
}

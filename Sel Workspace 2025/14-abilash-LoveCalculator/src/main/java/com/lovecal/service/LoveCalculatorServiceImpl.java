package com.lovecal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovecal.dao.LoveCalculatorDaoI;
import com.lovecal.dto.LoginDTO;
import com.lovecal.dto.LoveCalculatorDTO;
import com.lovecal.dto.RegisterDTO;
import com.lovecal.pojo.HistoryPojo;
import com.lovecal.pojo.UserPojo;

@Service
public class LoveCalculatorServiceImpl implements LoveCalculatorServiceI {

	@Autowired
	private LoveCalculatorDaoI loveCalculatorDao;
	
	@Override
	public boolean validateUser(LoginDTO loginDTO) {
		
		return loveCalculatorDao.validateUser(loginDTO);
	}

	@Override
	public boolean registerUser(RegisterDTO registerDto) {
		
		UserPojo user = new UserPojo(registerDto.getName(),registerDto.getEmail(),registerDto.getPhoneNo(),registerDto.getPassword());
		
		return loveCalculatorDao.registerUser(user);
	}

	@Override
	public boolean saveLoveResult(HistoryPojo history, int userId) {
		
		history.setUserId(userId);
		history.setYourName(history.getYourName());
		history.setCrushName(history.getCrushName());
		history.setResult(history.getResult());
		history.setRelationType(history.getRelationType());
		//history.setStatus("VISIBLE");
		
		return loveCalculatorDao.saveLoveResult(history);
	}

	@Override
	public List<HistoryPojo> getHistory(int userId) {
		
		List<HistoryPojo> historyPojo = loveCalculatorDao.getHistory(userId);
		
		return historyPojo;
	}

	@Override
	public UserPojo getUserByEmail(String email) {
		return loveCalculatorDao.getUser(email);
	}

	@Override
	public int calculateLovePercentage(String yourName, String crushName) {
		int score = (yourName + crushName).length() % 1904;
		return score;
	}
	
	@Override
	public String calculateLove(int score) {
		
		String[] FLAMES = { "FRIENDS", "LOVERS", "AFFECTIONATE", "MARRIAGE", "ENEMIES", "SIBLING" };
				
		int flamesCount = FLAMES.length;
		
		int index = score % flamesCount;
		
		String result = FLAMES[index];
		
		return result;
	}

	@Override
	public boolean deleteHistory(int historyId) {
		
		return loveCalculatorDao.deleteHistory(historyId);
	}

}

package com.lc.service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lc.dto.LoginDTO;
import com.lc.dto.RegDTO;
import com.lc.pojo.HistoryPojo;
import com.lc.pojo.UserPojo;
import com.lc.service.dao.rowmapper.RowMapperImp;
import com.lc.service.dao.rsextractor.HistoryPojoRSExtractor;

@Service
public class LoveCalculatorDaoImp implements LoveCalculatorDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean validateUser(LoginDTO loginDto) { 


		try {
			UserPojo userPojo = getUserObjectFromUserName(loginDto.getUserName());
			
			/*Logic for User input and database input match or not*/
			if(!(loginDto.getUserName().equals(userPojo.getUserName()) && 
					loginDto.getPassword().equals(userPojo.getPassword()))) {
				System.out.println("Password not match, not sure>>>>>");
				return false;
			}
			

			System.out.println("Perfectly Fine.... Vaild!!!");
			
			return true;

		}catch(Exception e) {
			System.out.println("No Record Found!!!");
			return false;
		}
	

	}

	@Override
	public int registerUser(RegDTO reg) { 
		System.out.println("Inside Reguser User Method()>>>>");

		String query = "INSERT INTO lovecalculator.user (name,user_name,mail_id,phone_no,password) values(?,?,?,?,?);";

		Object[] o = {reg.getName(), reg.getLoginDTO().getUserName(), reg.getEmailDTO().getEmail(), reg.getPhoneNo(),
				reg.getLoginDTO().getPassword() };
		int update = jdbcTemplate.update(query, o);
		System.out.println("Update  : " + update);
		return update;

	}

	@Override
	public int getPrimaryKeyByUserName(String userName) {  
		try {
			UserPojo userPojo = getUserObjectFromUserName(userName);

			return userPojo.getuId();

		} catch (Exception e) {
			System.out.println("User Not Avaiable in Databaase!!>>>>");
			return -1;
		}
	}

	@Override
	public UserPojo getUserObjectFromUserName(String userName) throws Exception{
		String query = "SELECT * FROM lovecalculator.user where user_name=?";

		Object[] o = {userName };
		

		
		UserPojo userPojo = jdbcTemplate.queryForObject(query, new RowMapperImp(), o);
		System.out.println("Userojo : " + userPojo);
		return userPojo;
	}

	
	@Override
	public int addHistoryToDatabase(HistoryPojo hp) { 
		
		String query = "INSERT INTO lovecalculator.user_history (uid, userName, crushName, result) values(?,?,?,?);";

		Object[] o = {hp.getUid(),hp.getUserName(),hp.getCrushName(),hp.getResult()};
		
		int update = jdbcTemplate.update(query,o);
		
		
		return update;
	}

	@Override
	public List<HistoryPojo> getRecords(String userName) {
		String query="SELECT * FROM lovecalculator.user_history where uid=?;";
		
		/*Get Pk by Using userName*/
		int pkey=getPrimaryKeyByUserName(userName);
		
		/*Get all data*/
		
		List<HistoryPojo> records=jdbcTemplate.query(query,new HistoryPojoRSExtractor(),pkey);
		System.out.println("Records Print : " + records);
		return records;
	}

	@Override
	public boolean deleteHistoryById(int hid) {
		String query="DELETE from lovecalculator.user_history"
				+ " WHERE hid=?;";
		int update = jdbcTemplate.update(query,hid);
		System.out.println("UPdate : " + update);
		if(update>0) {
			return true;
		}
		return false;
	}

	
}

package com.lovecal.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.lovecal.dto.LoginDTO;
import com.lovecal.pojo.HistoryPojo;
import com.lovecal.pojo.UserPojo;
import com.lovecal.util.LoveCalculatorUtil;


@Repository
public class LoveCalculatorDaoImpl implements LoveCalculatorDaoI {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable() {
	  String createUsersTable = """
	            CREATE TABLE IF NOT EXISTS users (
	                id INT AUTO_INCREMENT PRIMARY KEY,
	                name VARCHAR(100) NOT NULL,
	                email VARCHAR(100) NOT NULL UNIQUE,
	                phone VARCHAR(15),
	                password VARCHAR(255) NOT NULL,
	                status ENUM('ACTIVE', 'INACTIVE', 'DELETED') DEFAULT 'ACTIVE',
	                registered_at DATETIME DEFAULT CURRENT_TIMESTAMP
	            )
	        """;

	        String createLoveHistoryTable = """
	            CREATE TABLE IF NOT EXISTS love_history (
	                id INT AUTO_INCREMENT PRIMARY KEY,
	                user_id INT NOT NULL,
	                your_name VARCHAR(100) NOT NULL,
	                crush_name VARCHAR(100) NOT NULL,
	                result INT NOT NULL,
	                relation_type VARCHAR(50) NOT NULL,
	                status ENUM('VISIBLE', 'HIDDEN', 'FLAGGED') DEFAULT 'VISIBLE',
	                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
	                FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
	            )
	        """;

	        jdbcTemplate.execute(createUsersTable);
	        jdbcTemplate.execute(createLoveHistoryTable);

	        System.out.println("~~~~~~~ Tables created successfully.");

	}
	
	
	@Override
	public boolean fillDefaultdata() {
		 // Insert dummy users
        String userSql = """
            INSERT INTO users (name, email, phone, password, status)
            VALUES (?, ?, ?, ?, ?)
        """;
        
        jdbcTemplate.update(userSql, "Karthick", "karhick@cdp.com", "9876543210", "pass123", "ACTIVE");
        jdbcTemplate.update(userSql, "priety", "priety@cdp.com", "9988776655", "pass789", "ACTIVE");
        jdbcTemplate.update(userSql, "Pranathi", "pranathi@cdp.com", "9123456780", "pass456", "ACTIVE");

        // Insert dummy love history
        String historySql = """
            INSERT INTO love_history (user_id, your_name, crush_name, result, relation_type, status)
            VALUES (?, ?, ?, ?, ?, ?)
        """;

        jdbcTemplate.update(historySql, 1, "Karthick", "Paranthi", 85, "Affair", "VISIBLE");
        jdbcTemplate.update(historySql, 1, "Karthick", "Priety", 45, "Crush", "VISIBLE");
        jdbcTemplate.update(historySql, 2, "Harsha", "Samantha", 95, "Marriage", "VISIBLE");
        jdbcTemplate.update(historySql, 3, "Arun", "Meena", 30, "Enemy", "VISIBLE");

        System.out.println(" Dummy data inserted successfully.");

		return true;
	}

	@Override
	public boolean registerUser(UserPojo userPojo) {
		
		String sql = """
	            INSERT INTO users (name, email, phone, password, status)
	            VALUES (?, ?, ?, ?, ?)
	        """;
		
		Object[] params = {
							userPojo.getName(),
				        	userPojo.getEmail(),
				        	userPojo.getPhone(),
				        	userPojo.getPassword(), // ideally encrypted
				        	userPojo.getStatus() != null ? userPojo.getStatus() : "ACTIVE"
				        };

	    int affectedRow = jdbcTemplate.update(sql,params);

		return affectedRow > 0;
	}

	@Override
	public boolean validateUser(LoginDTO loginDto) {
		String sql = "SELECT COUNT(*) FROM users "
				+ "WHERE email = ? AND password = ? AND status = 'ACTIVE'";

		Object[] params = {loginDto.getUserName(),loginDto.getPassword()};
		
	    Integer count = jdbcTemplate.queryForObject(sql, Integer.class,params);

	    return count != null && count > 0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<HistoryPojo> getHistory(int id) {
		
		String query = "SELECT * FROM love_history WHERE user_id = ?";

		ResultSetExtractor<List<HistoryPojo>> rm = rs -> {
			List<HistoryPojo> list = new ArrayList<>();
			
			
			while(rs.next()) {
				HistoryPojo history = new HistoryPojo();
				history.setId(rs.getInt("id"));
				history.setUserId(rs.getInt("user_id"));
				history.setYourName(rs.getString("your_name"));
				history.setCrushName(rs.getString("crush_name"));
				history.setResult(rs.getInt("result"));
				history.setRelationType(rs.getString("relation_type"));
				history.setStatus(rs.getString("status"));
				history.setTimestamp(rs.getTimestamp("timestamp").toLocalDateTime());
				list.add(history);
			}
			
			return list;
		};
		
		return jdbcTemplate.query(query,new Object[] {id},rm);

	}

	@Override
	public boolean saveLoveResult(HistoryPojo history) {
		
		String sql = """
	            INSERT INTO love_history (user_id, your_name, crush_name, result, relation_type, status)
	            VALUES (?, ?, ?, ?, ?, ?)
	        """;

		Object[] params = {history.getUserId(),history.getYourName(),
				history.getCrushName(),history.getResult(),
				history.getRelationType(),history.getStatus()};
		
		int affectedRows = jdbcTemplate.update(sql,params);
		
		return affectedRows > 0;
	}


	@Override
	public UserPojo getUser(String email) {
		
		String query = "SELECT * FROM users WHERE email = ?"; 
		
		List<Map<String, Object>> userListMap = jdbcTemplate.queryForList(query,email);
		
		System.out.println("User :: " + userListMap);
		UserPojo user = LoveCalculatorUtil.getUserPojoFromUserListMap(userListMap);
		return user;
	}


	@Override
	public boolean deleteHistory(int historyId) {
		String query = 		"DELETE FROM love_history "
						  + "WHERE id = ?";
		
		int affectedRows = jdbcTemplate.update(query,historyId);
		
		System.out.println("DAO - Delete History : " + historyId + " Status : " + affectedRows );
		
		return affectedRows > 0;
	}
	
	
	

}

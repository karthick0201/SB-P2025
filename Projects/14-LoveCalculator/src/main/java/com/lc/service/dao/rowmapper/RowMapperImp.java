package com.lc.service.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lc.pojo.UserPojo;

public class RowMapperImp implements RowMapper<UserPojo> {

	@Override
	public UserPojo mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserPojo us = new UserPojo();
		
		us.setuId(rs.getInt(1));
		us.setName(rs.getString(2));
		us.setUserName(rs.getString(3));
		us.setMailId(rs.getString(4));
		us.setPhoneNo(rs.getString(5));
		us.setPassword(rs.getString(6));

		return us;
	}

}

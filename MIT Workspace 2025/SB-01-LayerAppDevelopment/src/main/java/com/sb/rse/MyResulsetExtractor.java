package com.sb.rse;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sb.entity.Employee;

public class MyResulsetExtractor implements ResultSetExtractor<List<Employee>>{

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employee> al=new ArrayList<Employee>();
		while(rs.next()) {
			Employee e=new Employee.EmployeeBuilder()
					.setId(rs.getInt(1))
					.setName(rs.getString(2))
					.setRole(rs.getString(3))
//					.setJoinDate(rs.getDate(4).toLocalDate())
					.setJoinedDate( rs.getDate(4) == null ? null : rs.getDate(4).toLocalDate())
					.build();
			//add to list
			al.add(e);
					
		}
		return al; 
	}

}

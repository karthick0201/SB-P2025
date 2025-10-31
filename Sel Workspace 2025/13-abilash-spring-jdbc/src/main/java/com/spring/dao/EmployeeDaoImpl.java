package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mapper.EmployeeRowMapper;
import com.spring.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * Methods : boolean --> .execute - ddl .update - dml .query - select
	 * 
	 */ 

	@Override
	public int addEmployee(Employee employee) {

		String query = "INSERT INTO employee values(?,?,?);";

		Object[] params = { employee.getEmployeeId(), employee.getName(), employee.getLocation() };

		int rows = jdbcTemplate.update(query, params);

		System.out.println("Rows : " + rows);

		return rows;
	}
	@Override
	public List<Employee> getAllEmployees() {

		String query = "SELECT * FROM employee";

		List<Employee> employeesList = jdbcTemplate.query(query, new EmployeeRowMapper());

		return employeesList;
	}
	@Override
	public boolean deleteEmployeeById(int employeeId) {

		String query = "DELETE FROM employee WHERE id = ?";

		int update = jdbcTemplate.update(query, employeeId);

		System.out.println("Delete Update : " + update);

		return update > 0;
	}

	@Override
	public boolean updateEmployeeLocationById(int employeeId, String location) {

		// WRONG LOCATION PLACED
		/*  String query = "UPDATE employee WHERE id = ? SET address = ?"; int update =
		  jdbcTemplate.update(query,employeeId,location); // or Pass as Object[]
		 */

		String query = "UPDATE employee SET address = ? WHERE id = ?";
		
		int update = jdbcTemplate.update(query, location, employeeId);

		System.out.println("Upate : " + update);

		return update > 0;
	}

	@Override // Bean Property Row Mapper
	public List<Employee> getAllEmployeesUsingBeanPropertyRowMapper() {
		
		/*
		 * Mapper:
		 * -------
		 * 
		 * 1. RowMapper
		 * 2. BeanPropertyRowMapper
		 * 3. ResultSetExtractor
		 * 
		 * */
		
		//String query = "SELECT * FROM employee";
		// Alias name
		String query = "SELECT id AS employeeId, name, address AS location FROM employee";

		List<Employee> employeesList = jdbcTemplate.query(query, new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return employeesList;
	}
	@Override
	public Employee getEmployeeUsingIdBeanPropertyRowMapper(int id) {
		
//		String query = "SELECT * employee WHERE id = ?";
		String query = "SELECT id AS employeeId, name, address AS location FROM employee WHERE id = ?";
		
		Employee employee = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return employee;
	}
	

}

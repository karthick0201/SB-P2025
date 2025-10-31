package com.spring.service;

import java.util.List;

import com.spring.model.Employee;

public interface IEmployeeService {

	public int addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public boolean deleteEmployeeById(int employeeId);

	public boolean updateEmployeeLocationById(int employeeId,String location);

	public List<Employee> getAllEmployeesUsingBeanPropertyRowMapper();

	public Employee getEmployeeUsingIdBeanPropertyRowMapper(int id);
}

package com.sb.dao;

import java.util.List;

import com.sb.entity.Employee;

public interface EmployeeDaoI {
	boolean addEmployee(Employee e);
	boolean deleteEmployee(int id);
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();
	boolean containsEmployee(int id);

}

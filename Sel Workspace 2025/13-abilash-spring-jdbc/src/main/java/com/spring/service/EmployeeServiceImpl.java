package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.IEmployeeDao;
import com.spring.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public int addEmployee(Employee employee) {
		
		int rows = employeeDao.addEmployee(employee);
		
		return rows;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = employeeDao.getAllEmployees();
		
		System.out.println(">----------> Employees List <-------------<");
		
			allEmployees
				.stream()
				.forEach(e -> {
					String format = String.format("ID : %d || Name : %s || Location : %s",e.getEmployeeId(),e.getName(),e.getLocation());
					System.out.println(format);
				});
		System.out.println(">----------------------------------------<");
		return allEmployees;
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		boolean status = employeeDao.deleteEmployeeById(employeeId);
		
		return status;
	}

	@Override
	public boolean updateEmployeeLocationById(int employeeId,String name) {
		boolean status = employeeDao.updateEmployeeLocationById(employeeId, name);
		
		return status;
	}

	@Override
	public List<Employee> getAllEmployeesUsingBeanPropertyRowMapper() {
		
		List<Employee> empList = employeeDao.getAllEmployeesUsingBeanPropertyRowMapper();
		
		System.out.println(">----------> Employees List Using Bean Property Row Mapper <-------------<");
		
		empList
			.stream()
			.forEach(e -> {
				String format = String.format("ID : %d || Name : %s || Location : %s",e.getEmployeeId(),e.getName(),e.getLocation());
				System.out.println(format);
			});
		System.out.println(">----------------------------------------<");
		
		
		
		return empList;
	}

	@Override
	public Employee getEmployeeUsingIdBeanPropertyRowMapper(int id) {
		
		Employee e = employeeDao.getEmployeeUsingIdBeanPropertyRowMapper(id);
		
		System.out.println(">>-------> Employee Object Using BeanPropertyRowMapper <--------<<");
		
		String format = String.format("ID : %d || Name : %s || Location : %s",e.getEmployeeId(),e.getName(),e.getLocation());
		System.out.println(format);
		
		System.out.println(">>----------------------------------------------------------------<<");
		
		return e;
	}
	

}

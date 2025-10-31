package com.sb.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sb.dao.EmployeeDaoI;
import com.sb.entity.Employee;

@Controller
public class EmployeeControllerImpl implements EmployeeControllerI {
	
	@Autowired
	private EmployeeDaoI employeeDao;
	
	
	@Override
	public void reception() {
		Scanner in=new Scanner(System.in);
		boolean check=true;
		while(check) {
			headDisplay();
			System.out.println("Enter Your CHoice : ");
			int option=in.nextInt();
			switch(option) {
			case 1: // add emp
				addEmployee();
				break;
			case 2: // delete emp
				deleteEmployee();
				break;
			case 3: // view emp by id
				getEmployeeById();
				break;
			case 4: // view all emp
				getAllEmployees();
				break;
			case 5://contains employee
				containsEmployee();
				break;
			case 6: // return
				System.out.println("\t>>>ThankYOu!!!<<<");
				check=false;
				break;
				default:
					return;
			}
			
		}
		
		
	}

	private void headDisplay() {
		System.out.println(">>>>>>>Employee Management SYstem<<<<<<<<<<\n");
		System.out.println(""
				+ "1. Add Employee\n"
				+ "2. DeleteEmployee\n"
				+ "3. GetEmployeeById\n"
				+ "4. ViewAllEmployee\n"
				+ "5. ContainsEmployee\n"
				+ "6. Exit");
		System.out.println(">---------------<");
		
	}

	@Override
	public void addEmployee() {
		Scanner in=new Scanner(System.in);
		Employee e=new Employee.EmployeeBuilder().build();
		
		/* Get Input From User */
		String name,role;
		System.out.print("Enter Name : ");
		name=in.nextLine();
		System.out.print("Enter Role : ");
		role=in.nextLine();
		/* Set Data to Object */
		e.setName(name);
		e.setRole(role);
		e.setJoinedDate(LocalDate.now());
		/* Call Service Method */
		employeeDao.addEmployee(e);
		
		
	}

	@Override
	public void deleteEmployee() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Id : ");
		int id=in.nextInt();
		boolean deleteEmployee = employeeDao.deleteEmployee(id);
		if(deleteEmployee) {
			System.out.println("Deleted Successfull!!!");
		}
		
	}

	@Override
	public void getEmployeeById() { 
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Id : ");
		int id=in.nextInt();
		Employee e = employeeDao.getEmployeeById(id);
		e.display();
	}
	@Override
	public void getAllEmployees() { 
		List<Employee> e = employeeDao.getAllEmployees();
		for(Employee emp : e) {
			emp.display();
		}
		
	}

	@Override
	
	public void containsEmployee() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Id : ");
		int id=in.nextInt();
		
		boolean isContains=employeeDao.containsEmployee(id);
		if(isContains) {
			System.out.println("Yup!!! He is Present!!!");
		}else {
			System.out.println("I Don't Know what you are talking about....\n Ask some other places!!!");
		}
		
	}


}

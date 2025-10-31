package com.spring.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.model.Employee;
import com.spring.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;

	public void reception() {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			 System.out.println("\n>-----------------------------<\n");
			System.out.println("1. Add Employee \n2. Delete Employee Using ID"
					+ "\n3. Update Location Using ID \n4. Retrive all Employee "
					+ "\n5. Logout");
			
			System.out.print("Enter Your Option : ");
			int option = in.nextInt();
			
			switch(option) {
			
				case 1 : 
					addEmployee();
					System.out.println("Employee Added...");
					break;
				case 2 : 
					deleteEmployee();
					System.out.println("Employee Deleted Successfully!!!");
					break;
				case 3 : 
					
					updateLocation();
					System.out.println("Location is Updted!!!");
					break;
				case 4 : 
					System.out.println(">------->Employee Records<----------<");
					employeeService.getAllEmployees();
					System.out.println(">-----------------------------------<");
					break;
				case 5 : 
					System.out.println("Logout Successfully!!!!");
					return;
				default:
					System.out.println("Invalid Option!!!");
				}
			
		}
	}

	private void updateLocation() {
		Scanner in = new Scanner(System.in);
		
		System.out.println(">> UPDATE LOCATION USING ID OPERATION <<");
		
		System.out.print("ID : ");
		int id = in.nextInt();
		System.out.print("Location : " );
		String location = in.next();
		
		employeeService.updateEmployeeLocationById(id, location);
	}

	private void deleteEmployee() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(">> DELETE RECORD OPERATION <<");
		
		System.out.print("ID : ");
		int id = in.nextInt();
		employeeService.deleteEmployeeById(id);
		
	}

	private void addEmployee() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(">> Enter Employee Details <<");
		
		System.out.print("Id       : ");
		int id = in.nextInt();
		System.out.print("Name     : ");
		String name = in.next();
		System.out.print("Location : ");
		String location  = in.next();
		
		Employee emp = new Employee(id,name,location);
		
		int row = employeeService.addEmployee(emp);
	}

	
	
}

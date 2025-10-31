package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.BeansAppconfig;
import com.spring.controller.EmployeeController;

/**
 * Hello world!
 */
public class App {
	
	
	
    public static void main(String[] args) {
    	System.out.println(">--------------------------<");
        System.out.println(">>> SPRING JDBC PRATICE <<<");
        System.out.println(">--------------------------<");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansAppconfig.class);
        
        EmployeeController empController = context.getBean(EmployeeController.class);
        
        empController.reception();
        
        
        
    }

	private static void init() {
		
		// table creation logic
		// in database
		
		
		
	}
}

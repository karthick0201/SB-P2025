package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.dto.UserDTO;

public class AgeValidator implements Validator{ 

	/*
	 * Where you register this spring owns validation impl ?
	 * 		In @initBinder of corresponding controller class.
	 * */
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		System.out.println("Age Validator Suuports : ");
		return AgeValidator.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// Here Wrote Validation Logic required for field
		
		//Requirement 1 : name field can't be empty or null value
		ValidationUtils.rejectIfEmptyOrWhitespace(
				errors, // Error Ref
				"name", // Field Name
				"userDTO.name", // optional key
				"* name field can't be empty or Null value"); // default error message
		
		// Requirement 2 : Age should less than 30
		UserDTO userDTO = (UserDTO)target;
		
		if(userDTO.getAge() > 30) {
			errors.rejectValue(
					"age",				// DTO property Name 
					"userDTO.age", 		// Property userdefined Name
					"age should less than 30"); // default message
		}
		
		// Requirement 3 : email should ends with "...@cdp.com"
		
		if(!userDTO.getEmail().endsWith("@cdp.com")) {
			errors.rejectValue(
								"email",
								"userDTO.email",
								"* email must ends with '@cdp.com'"
								);
		}
		
	}
	
	
	

}

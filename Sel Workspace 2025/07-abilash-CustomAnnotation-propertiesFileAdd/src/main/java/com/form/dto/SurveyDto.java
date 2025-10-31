package com.form.dto;

import jakarta.validation.annotation.MyAgeAnnotation;
import jakarta.validation.constraints.NotBlank;

public class SurveyDto {
	
	@NotBlank
	private String name;
	/*REQUIREMENT : 
	 * Age - 30-50
	 * Error Message : "Age should be 30-50"
	 * 
	 * @Age(lower = 30, upper = "50", message = "optional...")
	 * 
	 * */
	
	//@MyAgeAnnotation(lower = 40, upper = 45, message = "Testing message...")
	@MyAgeAnnotation
	private Integer age; // privious type is int
	private String phoneNo;
	private String gender;
	private String country;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
}

package com.userinfo.dto;

import java.util.Arrays;

public class UserInfoDTO {
	
	private String name = "Your Name";
	
	private String email = "example@gamil.com";
	
	private char[] password; // password type
	
	private String dateOfBirth = "19/07/2000";
	
	private String aboutYou = "your Info..."; // text area
	
	private String[] hobbies = {"badminton", "cricket"}; // checkbox
	
	private String sex = "male"; // radio
	
	private String country = "China"; // select box/ dropdown

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAboutYou() {
		return aboutYou;
	}

	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [name=" + name + ", email=" + email + ", password=" + Arrays.toString(password)
				+ ", dateOfBirth=" + dateOfBirth + ", aboutYou=" + aboutYou + ", hobbies=" + Arrays.toString(hobbies)
				+ ", sex=" + sex + ", country=" + country + "]";
	}
	
}

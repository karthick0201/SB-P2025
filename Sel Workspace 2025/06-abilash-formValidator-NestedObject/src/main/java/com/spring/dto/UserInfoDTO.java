package com.spring.dto;

import java.util.Arrays;

public class UserInfoDTO {

	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;

	/* Example 1 -> Contains normal Info
	private CommunicationDTO communicationDto;
	*/
	/* Example 2 -> Contains Nested Info */
	private CommunicationDTO communicationDto;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public CommunicationDTO getCommunicationDto() {
		return communicationDto;
	}

	public void setCommunicationDto(CommunicationDTO communicationDto) {
		this.communicationDto = communicationDto;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [name=" + name + ", userName=" + userName + ", password=" + Arrays.toString(password)
				+ ", country=" + country + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender + "]";
	}

}

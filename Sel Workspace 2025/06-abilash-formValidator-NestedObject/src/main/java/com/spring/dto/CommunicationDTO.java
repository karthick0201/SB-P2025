package com.spring.dto;

public class CommunicationDTO {

	private String email;
	
//	private String phoneNo; //eg1 
	private PhoneDTO phone; // 91-8072036XXX
	
	public String getEmail() {
		return email;
	}

	public PhoneDTO getPhone() {
		return phone;
	}

	public void setPhone(PhoneDTO phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}

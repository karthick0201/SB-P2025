package com.track.dto;

public class CommunicationDTO {
	
	private String email;
	private String phoneNo;

	@Override
	public String toString() {
		String s = email + " : " + phoneNo;
		return s;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}

package com.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserLoginDTO {
	
//	@NotBlank
	@NotNull(message = "Must Not Null...")
	private String uName;
	private String cName;
	
	
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		String s= uName + " : " + cName;// TODO Auto-generated method stub
		return s;
	}
	
}

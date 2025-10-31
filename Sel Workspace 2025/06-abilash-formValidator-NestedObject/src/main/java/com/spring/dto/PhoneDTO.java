package com.spring.dto;

public class PhoneDTO {

	private String countryCode;
	private String phoneNo;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "PhoneDTO [countryCode=" + countryCode + ", phoneNo=" + phoneNo + "]";
	}
	
}

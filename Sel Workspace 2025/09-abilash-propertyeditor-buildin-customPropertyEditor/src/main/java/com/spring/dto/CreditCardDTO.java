package com.spring.dto;

public class CreditCardDTO {

	
	private String firstFourDigits;
	private String secondFourDigits;
	private String thirdFourDigits;
	private String fourthFourDigits;

	
	@Override
	public String toString() {
		String s=firstFourDigits + " - " + secondFourDigits+ " - " +thirdFourDigits+ " - " +fourthFourDigits; 
		return s;
	}
	
	public String getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(String firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public String getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(String secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public String getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(String thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public String getFourthFourDigits() {
		return fourthFourDigits;
	}

	public void setFourthFourDigits(String fourthFourDigits) {
		this.fourthFourDigits = fourthFourDigits;
	}

	
	
}

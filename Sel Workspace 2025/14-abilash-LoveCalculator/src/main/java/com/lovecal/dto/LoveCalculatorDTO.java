package com.lovecal.dto;

public class LoveCalculatorDTO {

	private String yourName;
	private String crushName;

	@Override
	public String toString() {
		return "LoveCalculatorDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}

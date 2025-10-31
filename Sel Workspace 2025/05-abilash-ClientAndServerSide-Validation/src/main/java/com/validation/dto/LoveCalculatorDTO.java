package com.validation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoveCalculatorDTO {
	
	@NotBlank(message = "* Can't be Empty")
	@Size(max = 8,min = 3)
	private String yourName;
	@NotEmpty
	private String crushName;

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

	@Override
	public String toString() {
		return "LoveCalculatorDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	
	
}

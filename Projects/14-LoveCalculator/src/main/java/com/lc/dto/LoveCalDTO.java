package com.lc.dto;

public class LoveCalDTO {

	private String name;

	private String crushName;

	@Override
	public String toString() {
		String s = name + " : " + crushName;
		return s;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}

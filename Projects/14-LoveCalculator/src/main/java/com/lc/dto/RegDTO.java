package com.lc.dto;

public class RegDTO {

	private String name;
	private String phoneNo;
	private EmailDTO emailDTO;
	private LoginDTO loginDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public EmailDTO getEmailDTO() {
		return emailDTO;
	}

	public void setEmailDTO(EmailDTO emailDTO) {
		this.emailDTO = emailDTO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	@Override
	public String toString() {
		return "RegDTO [name=" + name + ", phoneNo=" + phoneNo + ", emailDTO=" + emailDTO + ", loginDTO=" + loginDTO
				+ "]";
	}

}

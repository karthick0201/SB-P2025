package com.track.dto;

public class RegisterDTO {

	private String name;

	private CommunicationDTO communicationDTO;

	@Override
	public String toString() {
		
		String s = name + " : " + communicationDTO;// TODO Auto-generated method stub

		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

}

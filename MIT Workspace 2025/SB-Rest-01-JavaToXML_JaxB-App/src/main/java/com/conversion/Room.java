package com.conversion;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName(value = "room")
public class Room {

	@JsonProperty
	private int roomNo;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String roomColor;
	
	private List<Light> lightsList;

	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", name=" + name + ", roomColor=" + roomColor + ", lightsList=" + lightsList
				+ "]";
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomColor() {
		return roomColor;
	}

	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
	}

	public List<Light> getLightsList() {
		return lightsList;
	}

	public void setLightsList(List<Light> lightsList) {
		this.lightsList = lightsList;
	}
}

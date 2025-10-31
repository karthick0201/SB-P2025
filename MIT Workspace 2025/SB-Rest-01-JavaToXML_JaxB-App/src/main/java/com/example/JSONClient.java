package com.example;

import java.io.File;
import java.util.Arrays;

import com.conversion.Light;
import com.conversion.Room;

import tools.jackson.databind.ObjectMapper;


public class JSONClient {

	public static void main(String[] args) {
		
		
		seralizationExample();
		 
		 deseralizationExample();
	}

	private static void seralizationExample() {
		Room roomRef = getRoomInstance();
		 
		 // Seralization - Java to JSON
		 
		 System.out.println(">>------| Seralization Java Object to JSON ");
		 
		 ObjectMapper mapper = new ObjectMapper();
		 
		 String roomRefJson = mapper
				 				.writerWithDefaultPrettyPrinter()
				 				.writeValueAsString(roomRef);
		 
		 System.out.println(roomRefJson);
		 
		 System.out.println(">>-------------------------------------------<<");
		
		 // Write in file
		 
		 mapper.writeValue(new File("roomInfo.json"),roomRef);
		 System.out.println(">>----| Json saved in file Successfull...");
		
	}

	private static void deseralizationExample() {
		System.out.println(">>>----------| Deseralization - Json to JavaObject");
		 
		 ObjectMapper mapper = new ObjectMapper();
		 Room roomRef = mapper.readValue(new File("roomInfo.json"), Room.class);
		 
		 System.out.println(roomRef);
		 
		 System.out.println(">>-------------------------------------------------<<");
		
	}

	private static Room getRoomInstance() {
		Light l1 = new Light();
		l1.setId(1);
		l1.setName("White Light");
		l1.setEnergyWatt(8);
		
		Light l2 = new Light();
		l1.setId(2);
		l1.setName("Red Light");
		l1.setEnergyWatt(16);
		
		Light l3 = new Light();
		l1.setId(3);
		l1.setName("Blue Light");
		l1.setEnergyWatt(78);
		
		
		Room r1 = new Room();
		
		r1.setName("Karthi's Room");
		r1.setRoomColor("Yellow");
		r1.setRoomNo(11);
		r1.setLightsList(Arrays.asList(l1,l2,l3));
		
		return r1;
	}
}

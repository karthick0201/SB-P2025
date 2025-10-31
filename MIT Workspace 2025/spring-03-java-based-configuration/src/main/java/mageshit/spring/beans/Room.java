package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Room {
	
	private String roomName;
	
	@Autowired
	private IFan fan;
	
	public Room() {
		System.out.println("<><><> Room - Default Constructor Called!!!!");
	}
	
	public void setRoomName(String roomName) {
		System.out.println("[][][] - Room - setRoomName Method called!!!");
		this.roomName = roomName;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setFan(IFan fan) {
		System.out.println("[][][] - Room - setFan Method called!!!");
		this.fan = fan;
	}
	public IFan getFan() {
		return fan;
	}
	
	
	public void printRoomInfo() {
		System.out.println(">-----> Room Info <------<");
		System.out.println("Room Name : " + roomName);
		System.out.println("fan State : " + fan.isFanState());
		System.out.println(">------------------------<");
	}

	@Override
	public String toString() {
		return "Room [roomName=" + roomName + ", fan=" + fan + "]";
	}
	
	
}


package mageshit.spring.beans;

public class Stadium {
	private String name;
	private String location;
	
	public Stadium() {
		System.out.println("<><><> Stadium - Default Constructor called!!!!");
	}

	public Stadium(String name, String location) {
		System.out.println("<><><> Stadium - Param Constructor Called!!!");
		this.name = name;
		this.location = location;
	}
	public void printInfo() {
		System.out.println("Stadium Name : " + name + " || Stadium Location : " + location);
	}
	
}

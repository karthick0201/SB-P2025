package mageshit.spring.beans;

public class Player {
	
	private String name;
	private int jercyNumber;
	
	public Player() {
		System.out.println("<><><> Player Class - Default Constructor Called!!!!");
	}

	//Set and Get Methods
	public void setJercyNumber(int jercyNumber) {
		System.out.println("[][][] - Player - setJercyNumber Method called!!!");
		this.jercyNumber = jercyNumber;
	}
	public void setName(String name) {
		System.out.println("[][][] - Player - SetName Method called!!!");
		this.name = name;
	}
	public int getJercyNumber() {
		return jercyNumber;
	}
	public String getName() {
		return name;
	}
	public void printPlayer() {
		System.out.println("Name : " + name + " || Jercy Number : " + jercyNumber );
	}
	
}

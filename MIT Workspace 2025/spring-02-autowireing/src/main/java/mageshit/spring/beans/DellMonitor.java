package mageshit.spring.beans;

public class DellMonitor implements IMonitor {

	private String name;
	
	public DellMonitor() {
		System.out.println("<><><> Dell Monitor - Default Constructor Called!!!!");
	}
	
	@Override
	public void display() {
		System.out.println(">>******* Displaying Dell Monitor ********<<");

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("[][][] - DellMonitor - SetMonitorName Method called!!!");

		this.name = name;
	}

}

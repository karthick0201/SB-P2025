package mageshit.spring.beans;

public class LGMonitor implements IMonitor {

	private String name;

	public LGMonitor() {
		System.out.println("<><><> LG Monitor - Default Constructor Called!!!!");

	}
	
	@Override
	public void display() {
		System.out.println(">>******* Displaying LGMonitor Monitor ********<<");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("[][][] - LGMonitor - SetMonitorName Method called!!!");

		this.name = name;
	}

}

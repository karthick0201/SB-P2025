package mageshit.spring.beans;

public class Labtop {

	private String name;
	private IMonitor monitor;
	public Labtop() {
		System.out.println("<><><> Labtop - Default Constructor Called!!!!");
	}
	public void powerOn() {
		System.out.println("Labtop : " + this.name);
		System.out.println("Labtop On!!!");
		monitor.display();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("[][][] - Labtop - setLabtopName Method called!!!");

		this.name = name;
	}
	public IMonitor getMonitor() {
		return monitor;
	}
	public void setMonitor(IMonitor monitor) {
		System.out.println("[][][] - Labtop - setMonitor Method called!!!");

		this.monitor = monitor;
	}
	
	public void printInfo() {
		System.out.println("LabtopName : " + name);
	}
	
	
}

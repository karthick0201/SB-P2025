package mageshit.spring.beans;

public class Battery {

	private String batteryName;
	
	public Battery() {
		// TODO Auto-generated constructor stub
		System.out.println("<><><> Battery - Default Constructor Called!!!!");
	}
	public Battery(String batteryName) {
		System.out.println("<><><> Battery - Param Constructor Called!!!!");
		this.batteryName = batteryName;
	}
	
	public String getBatteryName() {
		return batteryName;
	}
	
}

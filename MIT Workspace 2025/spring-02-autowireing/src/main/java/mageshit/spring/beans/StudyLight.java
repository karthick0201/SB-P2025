package mageshit.spring.beans;

public class StudyLight {

	private String lightName;
	
	private Battery battery;

	
	public StudyLight(String lightName, Battery battery) {
		super();
		System.out.println("<><><> StudyLight - Param Constructor Called!!!!");
		this.lightName = lightName;
		this.battery = battery;
	}
	
	public void lightOn() {
		System.out.println("~~~~Study Light Is On....");
		System.out.println("Light Name : " + lightName);
		System.out.println("Battery Name : " + battery.getBatteryName());
	}
	
}

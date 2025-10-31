package mageshit.spring.beans;

public class BatteryFan implements IFan {

	private String fanName;
	private boolean fanState;
	
	public BatteryFan() {
		System.out.println("<><><> BatteryFan - Default Constructor Called!!!!");
	}
	
	@Override
	public boolean isFanState() {
		
		return this.fanState;
	}

	public String getFanName() {
		return fanName;
	}

	public void setFanName(String fanName) {
		System.out.println("[][][] - BatteryFan - setFanName Method called!!!");
		this.fanName = fanName;
	}

	public void setFanState(boolean fanState) {
		System.out.println("[][][] - BatteryFan - setFanState Method called!!!");
		this.fanState = fanState;
	}

	@Override
	public String toString() {
		return "BatteryFan [fanName=" + fanName + ", fanState=" + fanState + "]";
	}

}

package mageshit.spring.beans;


public class EletricFan implements IFan {

	private String fanName;
	private boolean fanState;
	
	public EletricFan() {
		System.out.println("<><><> EletricFan - Default Constructor Called!!!!");
	}
	
	@Override
	public boolean isFanState() {
		
		return this.fanState;
	}

	public String getFanName() {
		return fanName;
	}

	public void setFanName(String fanName) {
		System.out.println("[][][] - EletricFan - setFanName Method called!!!");

		this.fanName = fanName;
	}

	public void setFanState(boolean fanState) {
		System.out.println("[][][] - EletricFan - setFanState Method called!!!");

		this.fanState = fanState;
	}

	@Override
	public String toString() {
		return "EletricFan [fanName=" + fanName + ", fanState=" + fanState + "]";
	}

}

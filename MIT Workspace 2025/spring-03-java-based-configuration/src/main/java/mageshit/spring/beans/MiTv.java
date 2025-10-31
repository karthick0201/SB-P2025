package mageshit.spring.beans;

public class MiTv {
	
	private String tvName;
	
	private String model;

	public MiTv(String tvName, String model) {
		this.tvName = tvName;
		this.model = model;
		System.out.println("<><><> MiTv - Param Constructor Called!!!!");
		
	}

	@Override
	public String toString() {
		return "MiTv [tvName=" + tvName + ", model=" + model + "]";
	}
	
	

}

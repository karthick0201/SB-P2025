package mageshit.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements ITeacher {

	
	public MathsTeacher() {
		System.out.println("<><><> MathsTeacher - Default Constructor Called!!!!");
	}
	
	@Override
	public void teach() {
		System.out.println("Maths Teacher - teaching Maths!!!");
		
	}

}

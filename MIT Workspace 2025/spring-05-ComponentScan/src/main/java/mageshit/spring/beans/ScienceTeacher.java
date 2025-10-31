package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ScienceTeacher implements ITeacher {

	@Value("Senku")
	private String name;
	
	public ScienceTeacher() {
		System.out.println("<><><> ScienceTeacher - Default Constructor Called!!!!");

	}
	
	@Override
	public void teach() {
		System.out.println("Science Teacher Senku - teaching about Revive Fluid!!!");
	}

}

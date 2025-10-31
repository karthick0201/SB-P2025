package mageshit.spring.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SocialTeacher implements ITeacher {

	
	public SocialTeacher() {
		System.out.println("<><><> SocialTeacher - Default Constructor Called!!!!");
	}
	@Override
	public void teach() {
		System.out.println("Social Teacher - teaching about One piece!!!");
	}
}

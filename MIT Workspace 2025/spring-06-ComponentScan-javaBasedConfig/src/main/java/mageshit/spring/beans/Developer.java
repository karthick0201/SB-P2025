package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Developer extends Member implements IDeveloper{

	public Developer() {
		System.out.println("<><><> Developer - Default Constructor Called!!!!");
	}
	
	@Override
	@Value("Akalya") // using set Method to set a parent class name
	public void setName(String name) {
		super.setName(name);
	}
	
	
	@Override
	public void develop() {
		System.out.println("Developer - " + super.getName() + " :\n\t Developing Sign dialog Using Lyte Framework");
	}
	
}

package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	@Value("Harsha")
	private String name;
	
	public Principal() {
		System.out.println("<><><> Principal - Default Constructor Called!!!!");
	}
	
	public void makeDecision() {
		String hisDecision = String.format("Principal %s : Do What I Say!!!", name);
		System.out.println(hisDecision);
	}

	@Override
	public String toString() {
		return "Principal [name=" + name + "]";
	}
}

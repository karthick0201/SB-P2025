package mageshit.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Member {
//	@Value("which name")
	private String name;
	
	public Member() {
		System.out.println("<><><> Memeber - Default Constructor Called!!!!");
	}
	
	// Using Constructor Injection to inject the value of child classs
	public Member(String name) {
		this.name= name;
	}
	
	// Setter Injection - User @Value annotation in set method of child class
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}



package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductManager extends Member{
	
//	public ProductManager() { // If you are injecting using constructor, defaultly it using non param constror...
//		System.out.println("<><><> ProductManager - Default Constructor Called!!!!");
//	}
	
	// Using Constructor Injection to set Parent class
	public ProductManager(@Value("Shyamla")String name){
		super(name);
	}

	public void assignWork() {
		System.out.println(String.format("Manager - %s : \n\t Team, Migerate JQuery to Lyte", super.getName()));
		
	}

}

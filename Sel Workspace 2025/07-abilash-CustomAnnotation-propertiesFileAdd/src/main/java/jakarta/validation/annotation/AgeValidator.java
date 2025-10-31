package jakarta.validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<MyAgeAnnotation, Integer>{

	private int lower;
	private int upper;
	
	@Override
	public void initialize(MyAgeAnnotation constraintAnnotation) {
		
		// this method called one  - Like @PostConstrct Annotation
		
		 lower = constraintAnnotation.lower();
		 upper = constraintAnnotation.upper();
		 
		 String logMessage = String.format("<~~~~~~~~~~~~~~~~~~~ : Age Validator - Initialize Method || lower - %d , upper - %d ", lower,upper);
		 System.out.println(logMessage);
		 
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// Here Validate Value and return true/false
		

		String logMessage = String.format("<~~~~~~~~~~~~~~~~~~~ : "
				+ "Age Validator - isValid Method || value : %d", value);
		 		
		System.out.println(logMessage);
		
		if(value == null) {
			System.out.println("Inside Null Check...");
			return false;
		}
		
		if(value < lower || value > upper ) {
			System.out.println("Inside value check...");
			return false;
		}
		
		System.out.println("return false....");
		return true;
	}
	
	

}

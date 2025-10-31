/**
 * 
 */
package jakarta.validation.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
/**
 * @author Karthick R
 *
 */

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { AgeValidator.class })
public @interface MyAgeAnnotation {


//	String message() default "Age should be 30 To 50";
//	String message() default "Age should be {lower} To {upper}";
	String message() default "{age.validator.limitmessage}";
//	String message() default "{surveyDto.age}";
	int lower() default 30;
	
	int upper() default 50;
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}

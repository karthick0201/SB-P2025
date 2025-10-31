package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Value("CDP")
	private String schoolName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private ITeacher teacher;
	
	public School() {
		System.out.println("<><><> School - Default Constructor Called!!!!");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public ITeacher getTeacher() {
		return teacher;
	}

	public void setTeacher(ITeacher teacher) {
		this.teacher = teacher;
	}
	
	public void test() {
		System.out.println(String.format("<**School %s **>", schoolName));
		System.out.println("<*****Principle Decision****>");
		principal.makeDecision();
		System.out.println("<*****Teacher Duty******>");
		teacher.teach();
		
	}
	
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", principal=" + principal + ", teacher=" + teacher + "]";
	}
	
	
}

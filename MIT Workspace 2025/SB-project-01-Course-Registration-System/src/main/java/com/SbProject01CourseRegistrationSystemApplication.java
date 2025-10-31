package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Course;
import com.entity.CourseRegistry;
import com.service.CourseService;

@SpringBootApplication
public class SbProject01CourseRegistrationSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbProject01CourseRegistrationSystemApplication.class, args);
	}

	@Autowired
	private CourseService courseService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Course c1 = new Course("Java Full stack", "Magesh", 4);
		Course c2 = new Course("IOT", "Suresh", 3);
		Course c3 = new Course("Cloud Computing", "Dharan", 2);
		Course c4 = new Course("AI", "Arun", 3);
		Course c5 = new Course("MachineLearning", "Varun", 14);
		
		List<Course> courseList = Arrays.asList(c1,c2,c3,c4,c5);
		
		//courseService.addCourse(courseList);
		
		// Test Course registry add
		
		CourseRegistry cr = new CourseRegistry();
		cr.setCourseName("Spring boot and Micro services");
		cr.setEmail("pran@cdp.com");
		cr.setName("pran cdp");
		
		//courseService.enrollCourse(cr);
		
		
		
	}

}


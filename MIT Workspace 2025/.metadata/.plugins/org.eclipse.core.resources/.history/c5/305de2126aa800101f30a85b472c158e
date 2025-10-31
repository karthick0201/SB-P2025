package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Course;
import com.entity.CourseRegistry;
import com.service.CourseService;

@RestController
//@CrossOrigin(origins = "http://localhost:5500")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping(value = "/courses")
	public List<Course> getCourses(){
		
		return courseService.getCourses();
	}
	
	@GetMapping(value = "/courses/enrolled")
	public List<CourseRegistry> enrolledStudents(){
		
		System.out.println("URL Mapping : enrolled");
		return courseService.getExtrolledInfo();
	}
	
	@PostMapping(value = "/courses/enroll-course")
	public String enrollCourse(@RequestParam("name")String name, 
								@RequestParam("email") String email, 
								@RequestParam("courseName") String courseName) {
		// data get from ui
		
		System.out.println("Landed... enrollCourse....");
		//CourseRegistry
		CourseRegistry cr = new CourseRegistry();
		cr.setCourseName(courseName);
		cr.setEmail(email);
		cr.setName(name);
		System.out.println(cr);
		courseService.enrollCourse(cr);
		
		String str = String.format("Congrats %s, %s Course Registed Successfull",name,courseName);
		
		return str;
		
	}
/*	
	@PostMapping(value = "/courses/enroll-course")
	public String enrollCourse(@RequestBody CourseRegistry cr) {
		// data get from ui
		
		System.out.println("Landed... enrollCourse.... - : RequestBody");
	
		System.out.println("CourseRegistry Object : " + cr);
		
		courseService.enrollCourse(cr);
		
		return "success";
		
	}
	*/
	
	

}

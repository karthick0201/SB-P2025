package com.service;

import java.util.List;

import com.entity.Course;
import com.entity.CourseRegistry;

public interface CourseService {

	public List<Course> getCourses();
	
	public boolean addCourse(Course course);
	
	public boolean addCourse(List<Course> courses);
	
	public boolean deleteCourse(int id);
	
	public List<CourseRegistry> getExtrolledInfo();
	
	public boolean enrollCourse(CourseRegistry courseRegistry);
	
}

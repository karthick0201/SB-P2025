package com.mit.controller;

import java.util.List;

import com.mit.entity.Student;

public interface StudentControllerI {

	public boolean saveStudent(Student student);
	
	public boolean saveStudent(List<Student> students);
	
	public Student getStudentById(int id);
	
	public boolean isStudentPresent(int id);
	
	public List<Student> getAllStudents();
	
	public List<Student> getAllStudentsById(List<Integer> ids);
	
	public boolean deleteStudentById(int id);
	
	public boolean deleteStudent(Student student);
	
	public boolean deleteStudentById(List<Integer> ids);
	
	public boolean deleteStudent(List<Student> students);
	
	public boolean deleteAllStudents();
	
	
}

package com.mit.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mit.entity.Student;

public interface StudentDao extends MongoRepository<Student, String>{
	
	
	//Finder Method
	
	public Optional<Student> findByName(String name);
	
	//Query
	
	@Query(value = "{}")
	public List<Student> getAllStudentsUsingQuery();

}

package com.mit.dao;

import org.springframework.data.repository.CrudRepository;

import com.mit.entity.Student;

/* This class automatically marks as spring bean 
 * 	Reason : Repository(I) is a marker interface and provide special power.
 * 			 Which ever class are extends that interface automatically marks as spring bean
 * */
public interface StudentDao extends CrudRepository<Student, Integer> {

	
	
}

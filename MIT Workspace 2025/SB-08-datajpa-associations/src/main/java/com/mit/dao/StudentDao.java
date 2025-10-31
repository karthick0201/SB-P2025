package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{
	
	

}

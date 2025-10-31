package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{
	

}

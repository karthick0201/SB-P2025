package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Login;

public interface LoginDao extends JpaRepository<Login, Integer>{
	
	

}

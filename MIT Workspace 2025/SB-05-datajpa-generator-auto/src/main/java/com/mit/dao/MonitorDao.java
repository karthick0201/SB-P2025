package com.mit.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.mit.entity.table.Monitor;

public interface MonitorDao extends ListCrudRepository<Monitor, Integer> {
	
	

}

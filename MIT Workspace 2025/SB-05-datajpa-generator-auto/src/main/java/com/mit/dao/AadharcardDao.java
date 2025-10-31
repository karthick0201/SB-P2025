package com.mit.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.mit.entity.identity.AadharCard;

public interface AadharcardDao extends ListCrudRepository<AadharCard, Integer>{
	
	

}

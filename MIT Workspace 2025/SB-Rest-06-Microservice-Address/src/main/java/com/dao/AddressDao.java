package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{

	//Finder Method for Retreiving Record based on Non-Primary Key Column
		public Optional<Address> findByCustomerId(Integer customerId);
	

}

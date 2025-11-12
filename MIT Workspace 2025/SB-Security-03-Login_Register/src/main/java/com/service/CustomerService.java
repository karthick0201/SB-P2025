package com.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.entity.Customer;

@Service
public class CustomerService implements UserDetailsService{

	@Autowired
	private BCryptPasswordEncoder pswEncoder;
	
	@Autowired
	private CustomerDao customerDao;
	
	public boolean saveCustomer(Customer customerRef) {
		
		String encodedPsw = pswEncoder.encode(customerRef.getPassword());
		
		customerRef.setPassword(encodedPsw);
		
		Customer savedCustomerRef = customerDao.save(customerRef);
		
		return savedCustomerRef.getId() != null;
		
	}
	
	public List<Customer> getAllCustomer(){
		
		return customerDao.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		System.out.println("\n\n>>-------|| Service - loadUserByUsername Landed...\n\n");

		
		Customer customerRef = customerDao.findByEmail(email);
		
		return new User(customerRef.getEmail(), 
						customerRef.getPassword(),
						Collections.emptyList()
						);
	}
	
}

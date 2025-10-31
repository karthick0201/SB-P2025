package com.service;

import java.util.List;

import com.entity.Customer;
import com.response.CustomerResponse;

public interface CustomerService {
	
	public List<CustomerResponse> getAllCutomer();
	
	public CustomerResponse getCustomerById(int id) throws Exception;
	
	public CustomerResponse addCustomer(Customer customer);
	
	public boolean deleteCustomer(int id);
	
	public List<CustomerResponse> addCustomer(List<Customer> customerList);

}

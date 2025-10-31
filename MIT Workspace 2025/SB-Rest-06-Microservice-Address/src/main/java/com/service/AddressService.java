package com.service;

import java.util.List;

import com.request.AddressRequest;
import com.response.AddressResponse;

public interface AddressService {
	
	public List<AddressResponse> getAllAddress();
	
	public AddressResponse getAddressById(int id) throws Exception;
	
	public AddressResponse getAddressByCustomerId(int id) throws Exception;
	
	public AddressResponse addAddress(AddressRequest addressRequest);

	public String deleteAddress(int id);
	

}

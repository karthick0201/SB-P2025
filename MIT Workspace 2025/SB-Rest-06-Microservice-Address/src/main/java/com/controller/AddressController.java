package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.request.AddressRequest;
import com.response.AddressResponse;
import com.service.AddressService;

@RestController
@RequestMapping(value = "api/address")
public class AddressController {

	
	@Autowired
	private AddressService addressService;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<AddressResponse>> getAllAddress(){
		
		List<AddressResponse> addressResList = addressService.getAllAddress();
		return new ResponseEntity<>(addressResList,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{addressId}")
	public ResponseEntity<?> getAddressById(@PathVariable("addressId") int id){
		
		AddressResponse addResRef;
		try {
			addResRef = addressService.getAddressById(id);
			return new ResponseEntity<>(addResRef,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
		}
		
	}
	
	@GetMapping(value = "/customer/{customerId}")
	public ResponseEntity<?> getAddressByCustomerId(@PathVariable("customerId") int id){
		AddressResponse addResRef;
		try {
			addResRef = addressService.getAddressByCustomerId(id);
			return new ResponseEntity<>(addResRef,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<AddressResponse> addAddress(@RequestBody AddressRequest addReq){
		return new ResponseEntity<AddressResponse>(addressService.addAddress(addReq),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{addressId}")
	public ResponseEntity<String> deleteAddress(@PathVariable("addressId") int id){
		return new ResponseEntity<String>(addressService.deleteAddress(id),HttpStatus.NO_CONTENT);
	}
	
}

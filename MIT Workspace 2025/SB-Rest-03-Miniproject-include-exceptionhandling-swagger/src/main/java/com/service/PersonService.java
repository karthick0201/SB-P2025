package com.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.dto.PersonDto;
import com.exception.ResourceNotFoundException;
import com.response.PageResponse;

public interface PersonService {

	/*1. Get All Customer*/
//	public List<PersonDto> getPersons();

	public PageResponse getPersons(int pageNumber,int pageSize,String sortBy,String sortDirection);
	
	
	/*2. Get Customer Using ID*/
	public PersonDto getPerson(int id) throws ResourceNotFoundException;
	
	/*3. Delete Customer*/
	public String deletePerson(int id);
	
	/*4. Add Customer*/
	public PersonDto addPerson(PersonDto personDto);
	
	/*5. Update Customer*/
	public PersonDto updatePerson(PersonDto personDto);
	
	/* 6. Update Customer Location */
	public PersonDto updatePersonLocation(int id, String location) throws ResourceNotFoundException;


	public String storePicture(String pictureFolderName, MultipartFile multipartFile) throws IOException;
	
	
}

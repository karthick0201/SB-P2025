package com.response;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(value = Include.NON_NULL)
public class CustomerResponse {
	
private int id;
	
	private String name;
	
	private String gender;
	
	private String email;
	
	private String phoneNo;
	
	private String location;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime updatedDate;	
	
	//Supporting the AddressResponse  - Here or From seperate class called 'AddressResponse'
	private AddressResponse addressResponse;

}
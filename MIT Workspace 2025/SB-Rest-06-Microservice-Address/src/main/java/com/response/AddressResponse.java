package com.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponse {

	
	private int id;
	
	private String doorNo;
	
	private String cityName;
	
	private String pincode;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime updatedDate;
	
	private Integer customerId;
	
}

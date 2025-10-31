package com.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressRequest {
	
	private String doorNo;

	private String cityName;

	private String pincode;

	private int customerId;
}

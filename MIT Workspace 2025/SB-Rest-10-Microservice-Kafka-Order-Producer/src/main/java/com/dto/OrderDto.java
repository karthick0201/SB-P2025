package com.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDto {
	
	private String orderId;
	
	private String name;
	
	private int quantity;
	
	private double price;
	

}

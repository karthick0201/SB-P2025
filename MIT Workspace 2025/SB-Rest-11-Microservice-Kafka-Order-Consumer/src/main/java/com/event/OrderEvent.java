package com.event;

import com.dto.OrderDto;

import lombok.Data;

@Data
public class OrderEvent {
	
	private String message;
	
	private String status;
	
	private OrderDto order;

}

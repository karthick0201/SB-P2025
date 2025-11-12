package com.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.OrderDto;
import com.event.OrderEvent;
import com.producer.OrderProducer;

@RestController
@RequestMapping(value = "api/order")
public class OrderController {
	
	private OrderProducer orderProducer;

	/*Constructor Injection --> we previously used @Autowired Annotation*/
	public OrderController(OrderProducer orderProducer) {
		this.orderProducer = orderProducer;
	}
	
	@PostMapping("/createNewOrder")
	public ResponseEntity<?> createNewOrder(@RequestBody OrderDto orderDto) {
		
		orderDto.setOrderId(UUID.randomUUID().toString());
		
		//Preparing OrderEvent
		OrderEvent orderEvent = new OrderEvent();
		
		orderEvent.setOrder(orderDto);
		orderEvent.setStatus("PENDING");
		orderEvent.setMessage("Order status is Pending");
		
		/*Sending To Kafka Broker*/
		String sentMessageStatus = orderProducer.sendMessage(orderEvent);
		
		return new ResponseEntity<>(sentMessageStatus,HttpStatus.CREATED);
		
	}
	
	

}

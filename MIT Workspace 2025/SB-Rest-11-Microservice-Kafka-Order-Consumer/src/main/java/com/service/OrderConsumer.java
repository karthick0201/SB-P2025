package com.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.dto.OrderDto;
import com.event.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderConsumer {

	
	@KafkaListener(
				topics = "${spring.kafka.topic.name}", 
				groupId = "${spring.kafka.consumer.group-id}",
				containerFactory="kafkaListenerFactory"
			 )
	public void orderReceivedDetails(OrderEvent orderEvent) {
		
		log.info("\n||********* OrderConsumer Received : \n" + orderEvent.toString() + "\n *********||");

		OrderDto orderInfo = orderEvent.getOrder();
		
		System.out.println("OrderInfo  : " + orderInfo);
		
		/* You can add to save to db logic here...*/
	}
}

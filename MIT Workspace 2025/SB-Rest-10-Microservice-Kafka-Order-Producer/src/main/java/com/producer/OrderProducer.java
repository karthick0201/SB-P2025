package com.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.event.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderProducer {
	
	@Autowired
	private NewTopic topic;
	
	@Autowired
	private KafkaTemplate<String, OrderEvent> kafkaTemplate;
	
	public String sendMessage(OrderEvent orderEvent) {
		
		log.info("||***** OrderEvent Started ******||");
		log.info("|| ***** OrderEvent Data || " + orderEvent.toString());
		Message<OrderEvent> kafkaMessage = MessageBuilder
											.withPayload(orderEvent)
											.setHeader(KafkaHeaders.TOPIC, topic.name())
											.build();
		
		try {
			kafkaTemplate.send(kafkaMessage);
			log.info("||***** OrderEvent Completed ******||");
			return "Order Placed!!!";
		}catch(Exception e) {
			e.printStackTrace();
			log.info("||***** OrderEvent Failed ******||");
			return "Problem Occured While Publicing Order"; 
		}
		
	}
	

}

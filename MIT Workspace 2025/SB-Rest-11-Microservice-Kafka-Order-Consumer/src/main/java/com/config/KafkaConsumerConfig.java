package com.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.event.OrderEvent;

@Configuration
public class KafkaConsumerConfig {

	@Bean
	public ConsumerFactory<String,OrderEvent> consumerFactory(){
		
		Map<String,Object> configProps = new HashMap<>();
		
		configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		
		
		configProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		
		return new DefaultKafkaConsumerFactory<>(
					configProps, 
					new StringDeserializer(),
					new JsonDeserializer<>(OrderEvent.class)
				);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, OrderEvent> kafkaListenerFactory(){
		
		ConcurrentKafkaListenerContainerFactory<String,OrderEvent> factory 
				= new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
	
}

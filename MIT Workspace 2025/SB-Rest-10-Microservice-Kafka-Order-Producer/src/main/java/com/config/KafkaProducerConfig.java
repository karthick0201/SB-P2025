package com.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.event.OrderEvent;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public NewTopic createTopic() {
		return TopicBuilder
				.name("order-topic-sts")
				.partitions(2)
				.build();
	}
	
	@Bean
	public ProducerFactory<String,OrderEvent> createProducerFactory(){
		
		Map<String,Object> configProps = new HashMap<>();
		// KAFKA Server Configuration
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		// Key COnfiguration
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		// Value COnfiguration
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configProps);
		
	}
	
	@Bean
	public KafkaTemplate<String, OrderEvent> kafkaTemplate(){
		
		return new KafkaTemplate<>(createProducerFactory());
		
	}
	
}

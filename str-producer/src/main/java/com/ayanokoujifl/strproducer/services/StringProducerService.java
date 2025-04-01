package com.ayanokoujifl.strproducer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StringProducerService {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		kafkaTemplate.send("str-topic", message).addCallback(success -> {
			if (success != null) {
				System.out.println("Message sent successfully: " + message);
				System.out.println("Partition: " + success.getRecordMetadata().partition() + " Offset: "
						+ success.getRecordMetadata().offset());
			}
		}, failure -> {
			System.err.println("Failed to send message: " + failure.getMessage());
		});

	}

}

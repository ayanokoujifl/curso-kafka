package com.ayanokoujifl.strconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StrConsumerListenet {

	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
	public void listen(String message) {
		System.out.println("Received message: " + message);
		// Process the message
		// For example, you can save it to a database or perform some action
		// based on the message content.
		System.out.println("Processed message: " + message);
	}

}

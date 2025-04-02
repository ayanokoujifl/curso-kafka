package com.ayanokoujifl.strconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class StrConsumerListener {

	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
	public void listen(String message) {
		System.out.println("LISTEN ::: Received message: " + message);
	}

	@KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
	public void log(String message) {
		System.out.println("LOG ::: Received message: " + message);
	}

	@KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "strContainerFactory")
	public void history(String message) {
		System.out.println("HISTORY ::: Received message: " + message);
	}

}

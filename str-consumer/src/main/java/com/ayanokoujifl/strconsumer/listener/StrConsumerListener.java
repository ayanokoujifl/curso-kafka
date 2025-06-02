package com.ayanokoujifl.strconsumer.listener;

import org.springframework.stereotype.Component;

import com.ayanokoujifl.strconsumer.custom.StrConsumerCustomListener;

@Component
public class StrConsumerListener {

	@StrConsumerCustomListener(groupId = "group-1")
	public void listen(String message) {
		System.out.println("LISTEN ::: Received message: " + message);
		throw new IllegalArgumentException("Simulated exception for testing error ");
	}

	@StrConsumerCustomListener(groupId = "group-1")
	public void log(String message) {
		System.out.println("LOG ::: Received message: " + message);
	}

	@StrConsumerCustomListener(groupId = "group-2", containerFactory = "validMessageContainerFactory")
	public void history(String message) {
		System.out.println("HISTORY ::: Received message: " + message);
	}

}

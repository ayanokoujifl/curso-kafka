package com.ayanokoujifl.strconsumer.exceptions;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ExceptionHandler implements KafkaListenerErrorHandler {

	@Override
	public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
		System.out.println( "EXCEPTION HANDLER ::: Error processing message: " + message.getPayload());
		return null;
	}
	
	

}

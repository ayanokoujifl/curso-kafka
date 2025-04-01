package com.ayanokoujifl.strproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayanokoujifl.strproducer.services.StringProducerService;

@RestController
@RequestMapping("/producer")
public class StringProducerController {

	@Autowired
	private StringProducerService producerService;

	@PostMapping
	public ResponseEntity<?> sendMessage(@RequestBody String message) {
		producerService.sendMessage(message);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}

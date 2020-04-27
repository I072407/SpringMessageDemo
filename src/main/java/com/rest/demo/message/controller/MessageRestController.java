package com.rest.demo.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.message.entity.Message;

@RestController
@RequestMapping("/api")
public class MessageRestController {
	
    @GetMapping("/message")
    public Message send() {
    	 	
    	return new Message("Check the REST");
    }
    
    @PostMapping("/message")
    public Message echo(@RequestBody Message theMessage ) {
    	return theMessage;
    }

}

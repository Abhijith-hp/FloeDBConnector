package com.gtl.floedbconnector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtl.floedbconnector.dto.ChatMessageRequest;
import com.gtl.floedbconnector.dto.ChatMessageResponse;
import com.gtl.floedbconnector.service.ChatMessageService;


import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/messages")
@Log4j2
public class ChatMessageController {

    @Autowired
    private ChatMessageService service;

    @PostMapping("/save")
    public ResponseEntity<ChatMessageResponse> create(@RequestBody ChatMessageRequest request) {
        log.info("Received request to save chat message: {}", request);
        return new ResponseEntity<>(service.save(request), HttpStatus.CREATED);
    }
}

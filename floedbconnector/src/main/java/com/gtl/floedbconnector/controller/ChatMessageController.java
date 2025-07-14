package com.gtl.floedbconnector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtl.floedbconnector.dto.ChatMessages;
import com.gtl.floedbconnector.dto.ChatMessageRequest;
import com.gtl.floedbconnector.service.ChatMessageService;

@RestController
@RequestMapping("/api/messages")
public class ChatMessageController {

    @Autowired
    private ChatMessageService service;

    @PostMapping("/save")
    public ResponseEntity<ChatMessages> create(@RequestBody ChatMessageRequest request) {
        return new ResponseEntity<>(service.save(request), HttpStatus.CREATED);
    }
}

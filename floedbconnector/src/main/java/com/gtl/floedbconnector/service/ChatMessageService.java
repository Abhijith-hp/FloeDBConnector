package com.gtl.floedbconnector.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtl.floedbconnector.dto.ChatMessages;
import com.gtl.floedbconnector.dto.ChatMessageRequest;
import com.gtl.floedbconnector.repository.ChatMessageRepository;

@Service
public class ChatMessageService {
    
    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public ChatMessages save(ChatMessageRequest request){
        ChatMessages message = new ChatMessages();
        message.setChatId(request.getChatId());
        message.setUsercode(request.getUsercode());
        message.setRole(request.getRole());
        message.setMessage(request.getMessage());
        message.setSystemip(request.getSystemip());
        message.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return chatMessageRepository.save(message);
    
    }

    
}

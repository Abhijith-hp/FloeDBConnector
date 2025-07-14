package com.gtl.floedbconnector.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtl.floedbconnector.dto.ChatMessages;
import com.gtl.floedbconnector.dto.ChatMessagesDocument;
import com.gtl.floedbconnector.jpa_repositories.ChatMessageRepository;
import com.gtl.floedbconnector.mongo_repositories.LogRepository;

import lombok.extern.log4j.Log4j2;

import com.gtl.floedbconnector.dto.ChatMessageRequest;
import com.gtl.floedbconnector.dto.ChatMessageResponse;

@Service
@Log4j2
public class ChatMessageService {
    
    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Autowired
    private LogRepository logRepo;

    public ChatMessageResponse save(ChatMessageRequest request){

        ChatMessages message = new ChatMessages();
        ChatMessagesDocument logMessage = new ChatMessagesDocument();

        log.info("Saving log message: {}", request);
        logMessage.setChatId(request.getChatId());
        logMessage.setUsercode(request.getUsercode());
        logMessage.setRole(request.getRole());
        logMessage.setMessage(request.getMessage());
        logMessage.setSystemip(request.getSystemip());
        logMessage.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        log.info("Saving chat message: {}", logMessage);
        message.setChatId(request.getChatId());
        message.setUsercode(request.getUsercode());
        message.setRole(request.getRole());
        message.setMessage(request.getMessage());
        message.setSystemip(request.getSystemip());
        message.setCreatedAt(new Timestamp(System.currentTimeMillis()));

        ChatMessagesDocument savedLog = logRepo.save(logMessage); 
        ChatMessages savedMessage = chatMessageRepository.save(message);

        log.info("Saved chat message with ID: {}", savedMessage.getId());
        return new ChatMessageResponse(
            savedMessage.getId(),               
            savedMessage.getChatId(),
            savedMessage.getUsercode(),
            savedMessage.getMessage(),
            savedLog.getId() != null ? savedLog.getId().toString() : null
    );

      
    
    }

    
}

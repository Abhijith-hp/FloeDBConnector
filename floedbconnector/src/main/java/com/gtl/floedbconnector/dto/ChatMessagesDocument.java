package com.gtl.floedbconnector.dto;

import java.sql.Timestamp;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;


@Data
@Document(collection = "ChatMessages")
public class ChatMessagesDocument {

    @Id
    private String id;

    private String chatId;
    private String usercode;
    private String role;
    private String message;
    private String systemip;
    private Timestamp createdAt;

   
}



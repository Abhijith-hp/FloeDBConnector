package com.gtl.floedbconnector.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(collection = "Logs")
public class LogEntry {

    @Id
    private String id;
    private String message;
    private String timestamp;
    
}

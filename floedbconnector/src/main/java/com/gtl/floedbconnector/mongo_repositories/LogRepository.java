package com.gtl.floedbconnector.mongo_repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gtl.floedbconnector.dto.ChatMessagesDocument;

@Repository
public interface LogRepository extends MongoRepository<ChatMessagesDocument, String> {
    // Custom query methods can be defined here if needed
    
}

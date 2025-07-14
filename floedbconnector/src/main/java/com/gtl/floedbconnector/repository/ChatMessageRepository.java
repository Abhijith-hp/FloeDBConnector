package com.gtl.floedbconnector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtl.floedbconnector.dto.ChatMessages;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessages, Long> {
}


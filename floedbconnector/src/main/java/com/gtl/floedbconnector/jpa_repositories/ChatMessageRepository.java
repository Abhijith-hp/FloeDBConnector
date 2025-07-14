package com.gtl.floedbconnector.jpa_repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtl.floedbconnector.dto.ChatMessages;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessages, Long> {
}


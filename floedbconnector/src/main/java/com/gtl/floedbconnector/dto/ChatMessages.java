package com.gtl.floedbconnector.dto;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "\"ChatMessages\"")
public class ChatMessages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_id")
    private String chatId;

    @Column(name = "usercode")
    private String usercode;

    @Column(name = "role")
    private String role;

    @Column(name = "message", columnDefinition = "text")
    private String message;

    @Column(name = "systemip")
    private String systemip;

    @Column(name = "createdat")
    private Timestamp createdAt;

    // Getters and Setters
}


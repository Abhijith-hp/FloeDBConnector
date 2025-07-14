package com.gtl.floedbconnector.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessageResponse {

    
    private Long postgresId;
    private String chatId;
    private String usercode;
    private String message;


    private String mongoId;
}


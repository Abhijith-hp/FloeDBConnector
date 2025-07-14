package com.gtl.floedbconnector.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ChatMessageRequest {

    @NotBlank
    private String chatId;

    @NotBlank
    private String usercode;

    @NotBlank
    private String role;

    @NotBlank
    private String message;

    @NotBlank
    private String systemip;
}


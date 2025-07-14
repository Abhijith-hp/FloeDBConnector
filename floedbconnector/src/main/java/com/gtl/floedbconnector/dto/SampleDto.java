package com.gtl.floedbconnector.dto;

public class SampleDto {
    private String message;

    public SampleDto() {}

    public SampleDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

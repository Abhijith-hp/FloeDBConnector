package com.gtl.floedbconnector.service;

import com.gtl.floedbconnector.dto.SampleDto;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public SampleDto getSampleMessage() {
        return new SampleDto("Hello from Service!");
    }
}

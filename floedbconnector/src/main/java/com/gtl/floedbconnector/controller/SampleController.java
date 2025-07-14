package com.gtl.floedbconnector.controller;

import com.gtl.floedbconnector.dto.SampleDto;
import com.gtl.floedbconnector.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping
    public SampleDto getSample() {
        return sampleService.getSampleMessage();
    }
}

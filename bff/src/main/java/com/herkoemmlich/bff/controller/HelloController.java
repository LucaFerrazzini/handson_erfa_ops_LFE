package com.herkoemmlich.bff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping(value = "/appconfig")
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }
}
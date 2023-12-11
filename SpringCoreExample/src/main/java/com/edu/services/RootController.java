package com.edu.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class RootController {

    @GetMapping("/")
    public String rootMapping() {
        return "Hello, server time: " + LocalDateTime.now();
    }

}

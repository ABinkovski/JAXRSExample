package com.edu.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collections;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

//@PreAuthorize("permitAll")
@RestController
public class RootApiService {

    //    @PreAuthorize("permitAll")
    @GetMapping(value = "/public", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> handleRootMessage() {
        return ResponseEntity.ok(Collections.singletonMap("message", "Hello, this is a publicly accessible endpoint. Actual time is: " + LocalDateTime.now()));
    }
}

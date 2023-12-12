package com.edu.services;

import com.edu.domain.model.exceptions.TestException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RestController
public class RootController {

    @GetMapping("/")
    public String rootMapping() {
        return "Hello, server time: " + LocalDateTime.now();
    }

    @GetMapping("/json")
    public ResponseEntity<Map<String, Object>> json() {
        final LinkedHashMap<String, Object> responseMap = new LinkedHashMap<>();
        responseMap.put("msg", "Hello");
        responseMap.put("serverTime", LocalDateTime.now());

        return ResponseEntity.ok(responseMap);
    }

    @GetMapping("/exception")
    public ResponseEntity<Object> throwAnyTestException() {
        throw new TestException("this is simple test exception");
    }
}

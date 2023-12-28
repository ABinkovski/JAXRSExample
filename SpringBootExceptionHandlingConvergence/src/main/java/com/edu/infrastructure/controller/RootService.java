package com.edu.infrastructure.controller;

import com.edu.domain.model.TestException;
import com.edu.infrastructure.config.exception.IllegalArgumentExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Collections;

@RequestMapping(RootService.APP_ROOT)
@RestController
public class RootService {
    public static final String APP_ROOT = "/";

    @GetMapping
    public Object rootEndpoint() {
        return Collections.singletonMap("serverTime", OffsetDateTime.now());
    }

    /*
     * {"errorTime":"2023-12-28T10:20:00.114+02:00",
     * "error":"Should be handled by IllegalArgumentExceptionHandler",
     * "handledBy":"com.edu.infrastructure.config.exception.IllegalArgumentExceptionHandler"}
     */
    @GetMapping("/throwException")
    public Object throwException() {
        throw new TestException(OffsetDateTime.now().toString(), // this message is skipped by casting to IllegalArgumentException
                new IllegalArgumentException("Should be handled by " + IllegalArgumentExceptionHandler.class.getSimpleName()));
    }

    /*
     * {"errorTime":"2023-12-28T10:22:43.835+02:00",
     * "error":"2023-12-28T10:22:43.832+02:00",
     * "handledBy":"com.edu.infrastructure.config.exception.TestExceptionHandler"}
     */
    @GetMapping("/throwSimpleException")
    public Object throwSimpleTestException() {
        throw new TestException(OffsetDateTime.now().toString(), null);
    }
}

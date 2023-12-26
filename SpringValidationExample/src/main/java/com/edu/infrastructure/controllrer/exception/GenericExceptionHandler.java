package com.edu.infrastructure.controllrer.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class GenericExceptionHandler {

    private final ObjectMapper mapper;

    @SneakyThrows
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(final Exception ex) {
        return ResponseEntity
//                .badRequest() // TODO fix response for properly type
                .ok()
//                .contentType(MediaType.APPLICATION_JSON)
                .body(ex.getMessage());
    }
}

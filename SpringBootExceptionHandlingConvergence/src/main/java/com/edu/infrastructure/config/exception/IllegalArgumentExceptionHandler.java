package com.edu.infrastructure.config.exception;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Order(Ordered.HIGHEST_PRECEDENCE + 1)
@RestControllerAdvice
public class IllegalArgumentExceptionHandler implements ExceptionHandlerI<IllegalArgumentException> {
    @Override
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleException(final IllegalArgumentException ex) {
        return getResponse(ex);
    }
}

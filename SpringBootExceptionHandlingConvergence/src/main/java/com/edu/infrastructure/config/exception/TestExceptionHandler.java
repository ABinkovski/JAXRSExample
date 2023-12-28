package com.edu.infrastructure.config.exception;

import com.edu.domain.model.TestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestExceptionHandler implements ExceptionHandlerI<TestException> {

    @Override
    @ExceptionHandler(TestException.class)
    public ResponseEntity<Object> handleException(final TestException ex) {
        return getResponse(ex.getMessage());
    }

}

package com.edu.config;

import com.edu.domain.model.exceptions.TestException;
import com.edu.infrastructure.model.RestExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(TestException.class)
    public ResponseEntity<Object> handleTestException(final TestException exception) {
        final HttpStatus httpStatus = HttpStatus.GATEWAY_TIMEOUT;
        return ResponseEntity.status(httpStatus)
                .body(RestExceptionDto.builder()
                        .reasonCode(httpStatus)
                        .reasonCodeValue(httpStatus.value())
                        .recoverable(true)
                        .description(exception.getMessage())
                        .exception(exception)
                        .details(exception.getMessage())
                        .build());
    }

}

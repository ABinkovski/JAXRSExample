package com.edu.infrastructure.exceptionhandler;

import com.edu.domain.exceptions.CustomException;
import com.edu.domain.exceptions.CustomExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomExceptionDto> handleCustomException(final CustomException customException) {
        return ResponseEntity.badRequest()
                .body(mapException(customException));
    }


    private CustomExceptionDto mapException(final CustomException customException) {
        return CustomExceptionDto.builder()
                .cause(customException)
                .message(customException.getMessage())
                .recoverable(true)
                .build();
    }
}

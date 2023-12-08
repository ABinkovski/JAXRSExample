package com.edu.infrastructure.exceptionhandler;

import com.edu.domain.exceptions.CustomException;
import com.edu.domain.exceptions.CustomExceptionDto;
import com.edu.domain.exceptions.CustomExceptionV2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomExceptionDto> handleCustomException(final CustomException customException) {
        return ResponseEntity.badRequest()
                .body(mapException(customException));
    }

    @ExceptionHandler(CustomExceptionV2.class)
    @ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
    public void handleCustomExceptionWithoutSensitiveInfo(final CustomExceptionV2 customException) {
    }


    private CustomExceptionDto mapException(final CustomException customException) {
        return CustomExceptionDto.builder()
                .cause(customException)
                .message(customException.getMessage())
                .recoverable(true)
                .build();
    }
}

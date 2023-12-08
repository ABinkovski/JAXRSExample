package com.edu.infrastructure.exceptionhandler;

import org.springframework.http.ResponseEntity;

public interface CustomRestExceptionMapper<E extends Throwable> {
    ResponseEntity<Object> toResponse(E ex);

}

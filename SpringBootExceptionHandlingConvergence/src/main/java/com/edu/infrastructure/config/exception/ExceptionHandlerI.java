package com.edu.infrastructure.config.exception;

import com.edu.domain.model.ErrorResponse;
import org.springframework.http.ResponseEntity;

import java.time.OffsetDateTime;

public interface ExceptionHandlerI<T> {

    ResponseEntity<Object> handleException(final T ex);

    default ResponseEntity<Object> getResponse(final RuntimeException ex) {
        return getResponse(ex.getMessage());
    }

    default ResponseEntity<Object> getResponse(final String errorMessage) {
        return ResponseEntity.badRequest()
                .body(ErrorResponse.builder()
                        .error(errorMessage)
                        .errorTime(OffsetDateTime.now())
                        .handledBy(this.getClass().getName())
                        .build()
                );
    }

}

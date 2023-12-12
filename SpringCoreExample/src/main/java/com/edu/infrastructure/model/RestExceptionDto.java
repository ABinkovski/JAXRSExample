package com.edu.infrastructure.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@RequiredArgsConstructor
public class RestExceptionDto {
    private final HttpStatus reasonCode;
    private final Integer reasonCodeValue;
    private final String description;
    private final Boolean recoverable;
    private final String details;
    private final Throwable exception;
}

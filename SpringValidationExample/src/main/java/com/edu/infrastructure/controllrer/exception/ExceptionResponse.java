package com.edu.infrastructure.controllrer.exception;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class ExceptionResponse {
    private final Exception ex;
}

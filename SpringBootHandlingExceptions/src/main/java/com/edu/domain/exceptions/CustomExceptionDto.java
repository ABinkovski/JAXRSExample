package com.edu.domain.exceptions;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class CustomExceptionDto {
    private final String message;
    private final boolean recoverable;
    private final Throwable cause;

}

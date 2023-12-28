package com.edu.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.OffsetDateTime;

@Getter
@Builder
@RequiredArgsConstructor
public class ErrorResponse {

    private final OffsetDateTime errorTime;

    private final String error;

    private final String handledBy;

}

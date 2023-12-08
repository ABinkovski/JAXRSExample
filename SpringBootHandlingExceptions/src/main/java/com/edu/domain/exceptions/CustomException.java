package com.edu.domain.exceptions;

public class CustomException extends RuntimeException {

    public CustomException() {
        super();
    }

    public CustomException(final String message) {
        super(message);
    }

    public CustomException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

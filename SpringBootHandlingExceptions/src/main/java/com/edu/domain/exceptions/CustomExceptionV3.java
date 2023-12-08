package com.edu.domain.exceptions;

public class CustomExceptionV3 extends RuntimeException {

    public CustomExceptionV3() {
        super();
    }

    public CustomExceptionV3(final String message) {
        super(message);
    }

    public CustomExceptionV3(final String message, final Throwable cause) {
        super(message, cause);
    }
}

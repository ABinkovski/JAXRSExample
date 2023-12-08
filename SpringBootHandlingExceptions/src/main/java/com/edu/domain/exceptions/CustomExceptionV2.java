package com.edu.domain.exceptions;

public class CustomExceptionV2 extends CustomException {

    public CustomExceptionV2() {
        super();
    }

    public CustomExceptionV2(final String message) {
        super(message);
    }

    public CustomExceptionV2(final String message, final Throwable cause) {
        super(message, cause);
    }
}

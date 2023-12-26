package com.edu.domain.utils;

import java.time.LocalDateTime;

public class TestUtils {

    public static IllegalArgumentException getException(final int level) {
        return getException(1, level);
    }

    private static IllegalArgumentException getException(final int level, final int expected) {
        if (level >= expected) {
            throw new IllegalArgumentException(LocalDateTime.now().toString());
        }
        return getException(level + 1, expected);
    }
}

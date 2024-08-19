package ru.dontmover.utils;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("52"));
    }
}
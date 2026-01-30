package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("Test Reverse String")
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Test Palindrome String")
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    @DisplayName("Test Convert To Uppercase")
    void testToUpperCase() {
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
    }
}

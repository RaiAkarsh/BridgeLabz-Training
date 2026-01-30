package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    @DisplayName("Test Valid Password")
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("StrongPass9"));
    }

    @Test
    @DisplayName("Test Invalid Password - Too Short")
    void testShortPassword() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    @DisplayName("Test Invalid Password - No Uppercase")
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    @DisplayName("Test Invalid Password - No Digit")
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    @DisplayName("Test Null Password")
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}

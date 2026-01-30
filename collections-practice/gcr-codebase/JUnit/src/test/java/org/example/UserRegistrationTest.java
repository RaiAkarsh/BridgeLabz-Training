package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    @Test
    @DisplayName("Test Valid User Registration")
    void testValidRegistration() {
        assertTrue(registration.registerUser(
                "akarsh",
                "akarsh@example.com",
                "Password1"));
    }

    @Test
    @DisplayName("Test Invalid Username")
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "",
                        "user@example.com",
                        "Password1"));
    }

    @Test
    @DisplayName("Test Invalid Email")
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "user",
                        "userexample.com",
                        "Password1"));
    }

    @Test
    @DisplayName("Test Invalid Password")
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "user",
                        "user@example.com",
                        "pass"));
    }
}

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {

    private Divider divider;

    @BeforeEach
    void setup() {
        divider = new Divider();
    }

    @Test
    @DisplayName("Test Divide By Zero Exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> divider.divide(10, 0));
    }

    @Test
    @DisplayName("Test Valid Division")
    void testValidDivision() {
        assertEquals(5, divider.divide(10, 2));
    }
}

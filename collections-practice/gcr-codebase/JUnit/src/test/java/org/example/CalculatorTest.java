package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Test Divide By Zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }
}

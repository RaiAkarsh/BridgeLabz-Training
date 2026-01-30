package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private final DateFormatter formatter = new DateFormatter();

    @Test
    @DisplayName("Test Valid Date Formatting")
    void testValidDate() {
        assertEquals("31-01-2024",
                formatter.formatDate("2024-01-31"));
    }

    @Test
    @DisplayName("Test Invalid Date Format")
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate("31-01-2024"));
    }

    @Test
    @DisplayName("Test Invalid Date Value")
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate("2024-02-30"));
    }

    @Test
    @DisplayName("Test Null Date")
    void testNullDate() {
        assertThrows(IllegalArgumentException.class,
                () -> formatter.formatDate(null));
    }
}

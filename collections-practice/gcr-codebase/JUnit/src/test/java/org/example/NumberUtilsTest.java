package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testEvenNumbers(int number) {
        assertTrue(new NumberUtils().isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testOddNumbers(int number) {
        assertFalse(new NumberUtils().isEven(number));
    }
}

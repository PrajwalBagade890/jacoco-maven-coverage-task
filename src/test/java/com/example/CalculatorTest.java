package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }

    @Test
    void shouldClassifyPositiveNumber() {
        assertEquals("Positive", calculator.classifyNumber(8));
    }

    @Test
    void shouldClassifyNegativeNumber() {
        assertEquals("Negative", calculator.classifyNumber(-3));
    }

    @Test
    void shouldClassifyZero() {
        assertEquals("Zero", calculator.classifyNumber(0));
    }
}

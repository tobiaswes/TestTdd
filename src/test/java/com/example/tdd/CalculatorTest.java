package com.example.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator TDD")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Should add two positive numbers")
    void shouldAddTwoPositiveNumbers() {

        // 1. Arrange (Förbered data)
        int numberA = 3;
        int numberB = 2;
        int expectedResult = 5;

        int result = calculator.add(numberA, numberB);

        assertEquals(expectedResult, result, "3 + 2 ska vara 5. Addition fungerade inte korrekt.");
    }
}

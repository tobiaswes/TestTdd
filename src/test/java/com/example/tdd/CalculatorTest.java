package com.example.tdd;

import org.example.Calculator;
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

    @Test
    @DisplayName("Should add zero to a number")
    void shouldAddZeroToNumber() {
        int expectedResult = 5;

        int result1 = calculator.add(5, 0);
        assertEquals(expectedResult, result1, "Att lägga till 0 i 5 ska returnera 10.");

        int result2 = calculator.add(0, 5);
        assertEquals(expectedResult, result2, "Att lägga till 5 i 0 ska returnera 10.");
    }

    @Test
    @DisplayName("Should add negative numbers")
    void shouldAddNegativeNumbers() {

        int expectedResult1 = -7;
        int result1 = calculator.add(-4, -3);
        assertEquals(expectedResult1, result1, "Summan av -4 och -3 ska vara -7.");

        // Fall 2: Positivt och negativt tal där resultatet är positivt (10) + (-5) = 5
        int expectedResult2 = 3;
        int result2 = calculator.add(8, -5);
        assertEquals(expectedResult2, result2, "8 + (-5) ska vara 3.");

        int expectedResult3 = -5;
        int result3 = calculator.add(5, -10);
        assertEquals(expectedResult3, result3, "5 + (-10) ska vara -5.");
    }

    @Test
    @DisplayName("Should subtract two numbers")
    void shouldSubtractTwoNumbers() {

        int expectedResult1 = 7;
        int result1 = calculator.subtract(10,3);
        assertEquals(expectedResult1,result1, "10 - 3 ska vara 7.");

        int expectedResult2 = 5;
        int result2 = calculator.subtract(5,0);
        assertEquals(expectedResult2,result2, "5 - 0 ska vara 5.");
    }

    @Test
    @DisplayName("Should handle negative result in subtraction")
    void shouldHandleNegativeResultInSubtraction() {

        int expectedResult1 = -5;
        int result1 = calculator.subtract(5, 10);
        assertEquals(expectedResult1, result1, "5 - 10 ska vara -5.");

        int expectedResult2 = 7;
        int result2 = calculator.subtract(5, -2);
        assertEquals(expectedResult2, result2, "5 - (-2) ska vara 7.");
    }

    @Test
    @DisplayName("Should multiply two numbers")
    void shouldMultiplyTwoNumbers() {

        int expectedResult1 = 20;
        int result1 = calculator.multiply(5, 4);
        assertEquals(expectedResult1, result1, "5 * 4 ska vara 20.");

        int expectedResult2 = -20;
        int result2 = calculator.multiply(5, -4);
        assertEquals(expectedResult2, result2, "5 * -4 ska vara -20.");

        int expectedResult3 = 20;
        int result3 = calculator.multiply(-5, -4);
        assertEquals(expectedResult3, result3, "-5 * -4 ska vara 20.");
    }

    @Test
    @DisplayName("Should return zero when multiplying by zero")
    void shouldReturnZeroWhenMultiplyingByZero() {
        int expectedResult = 0;

        int result1 = calculator.multiply(10, 0);
        assertEquals(expectedResult, result1, "Alla tal gånger noll ska vara noll.");

        int result2 = calculator.multiply(0, 10);
        assertEquals(expectedResult, result2, "Noll gånger alla tal ska vara noll.");
    }
}

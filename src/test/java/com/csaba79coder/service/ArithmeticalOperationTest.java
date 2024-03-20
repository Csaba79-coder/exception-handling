package com.csaba79coder.service;

import com.csaba79coder.exception.CustomException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticalOperationTest {

    @Test
    void testPerform() {
        ArithmeticalOperation operation = new ArithmeticalOperation();

        // Test case: division with non-zero denominator
        double numerator = 10;
        double denominator = 2;
        double expectedResult = 5;
        try {
            double result = operation.perform(numerator, denominator);
            assertEquals(expectedResult, result);
        } catch (CustomException e) {
            fail("CustomException should not have been thrown for a valid division operation.");
        }

        // Test case: division with non-zero denominator
        denominator = 0;
        String expectedErrorMessage = "Encountered ArithmeticException: Division by zero";
        try {
            double result = operation.perform(numerator, denominator);
            fail("CustomException should have been thrown for division by zero.");
        } catch (CustomException e) {
            assertEquals(expectedErrorMessage, e.getMessage());
        }

        // Test case: division with zero denominator
        double copyDenominator = denominator;
        assertThrows(CustomException.class, () -> operation.perform(numerator, copyDenominator));
    }
}
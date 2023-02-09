package org.lesson4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, 6",
            "7, 24, 25, 84",
            "2, 3, 4, 2.9047"
    })
    public void testTriangleArea(int a, int b, int c, double expected) {
        double actual = Triangle.area(a, b, c);
        assertEquals(expected, actual, 0.0001, "The area of the triangle is incorrect");
    }
    @Test
    public void testTriangleAreaWithNegativeSides() {
        int a = -3;
        int b = 4;
        int c = 5;
        double expected = 0;
        double actual = Triangle.area(a, b, c);
        assertEquals(expected, actual, 0.001, "The area of the triangle with negative side length should be 0");
    }
    @Test
    public void testTriangleAreaWithZeroSides() {
        int a = 0;
        int b = 4;
        int c = 5;
        double expected = 0;
        double actual = Triangle.area(a, b, c);
        assertEquals(expected, actual, 0.001, "The area of the triangle with zero side length should be 0");
    }
    @Test
    public void testTriangleAreaWithInvalidTriangle() {
        int a = 3;
        int b = 1;
        int c = 5;
        double expected = 0;
        double actual = Triangle.area(a, b, c);
        assertEquals(expected, actual, 0.001, "The area of the invalid triangle should be 0");
    }
}
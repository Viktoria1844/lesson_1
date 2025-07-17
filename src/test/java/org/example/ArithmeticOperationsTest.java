package org.example;

import jdk.jfr.Description;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticOperationsTest {

    @Test
    @Description("Факториал числа")
    void calculateFactorial() {
        assertEquals(ArithmeticOperations.calculateFactorial(0), 1);
        assertEquals(ArithmeticOperations.calculateFactorial(1), 1);
        assertEquals(ArithmeticOperations.calculateFactorial(3), 6);
        assertEquals(ArithmeticOperations.calculateFactorial(4), 24);
    }

    @Test
    @Description("Тест для получения площади треугольника")
    public void testTriangleArea() {
        assertEquals(ArithmeticOperations.getAreaTriangle(3, 4, 5), 6.0, 0.001);
        assertEquals(ArithmeticOperations.getAreaTriangle(2, 2, 3), 1.984313483298443, 0.001);
    }

    @Test
    @Description("Тест на совершение арифметических действий")
    public void testArithmeticOperations() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
        assertEquals(ArithmeticOperations.subtract(2, 3), -1);
        assertEquals(ArithmeticOperations.multiply(2, 3), 6);
        assertEquals(ArithmeticOperations.divide(3, 2), 1.5, 0.001);
    }

    @Test
    @Description("Тест на сравнение двух целых чисел")
    public void testNumberComparison() {
        assertTrue(ArithmeticOperations.isGreater(5, 3));
        assertFalse(ArithmeticOperations.isGreater(3, 5));
        assertTrue(ArithmeticOperations.isLess(3, 5));
        assertFalse(ArithmeticOperations.isLess(5, 3));
        assertTrue(ArithmeticOperations.isEqual(5, 5));
        assertFalse(ArithmeticOperations.isEqual(5, 3));
    }
}



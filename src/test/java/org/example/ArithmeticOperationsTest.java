package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @Test
    @DisplayName("Факториал числа")
    void calculateFactorial() {
        assertEquals(1, ArithmeticOperations.calculateFactorial(0));
        assertEquals(1, ArithmeticOperations.calculateFactorial(1));
        assertEquals(6, ArithmeticOperations.calculateFactorial(3));
        assertEquals(24, ArithmeticOperations.calculateFactorial(4));
    }


    @Test
    @DisplayName("Тест для получения площади треугольника")
    void getAreaTriangle() {
        assertEquals(6.0, ArithmeticOperations.getAreaTriangle(3, 4, 5), 0.001);
        assertEquals(1.984313483298443, ArithmeticOperations.getAreaTriangle(2, 2, 3), 0.001);
    }


    @Test
    @DisplayName("Тест на совершение арифметических действий")
    void addSubtractMultiplyDivide() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
        assertEquals(1.5, ArithmeticOperations.divide(3, 2), 0.001);
    }

    @Test
    @DisplayName("Тест на сравнение двух целых чисел")
    void testNumberComparison() {
        assertTrue(ArithmeticOperations.isGreater(5, 3));
        assertFalse(ArithmeticOperations.isGreater(3, 5));
        assertTrue(ArithmeticOperations.isLess(3, 5));
        assertFalse(ArithmeticOperations.isLess(5, 3));
        assertTrue(ArithmeticOperations.isEqual(5, 5));
        assertFalse(ArithmeticOperations.isEqual(5, 3));
    }
}
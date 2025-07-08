package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {


    @Test
    void getFactorial() {
        Factorial calculator = new Factorial();

        assertEquals(1, calculator.calculateFactorial(0));
        assertEquals(1, calculator.calculateFactorial(1));
        assertEquals(2, calculator.calculateFactorial(2));
        assertEquals(6, calculator.calculateFactorial(3));
        assertEquals(24, calculator.calculateFactorial(4));
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    void getAreaTriangle() {
        Factorial area = new Factorial();
        double sumArea = Factorial.getAreaTriangle(0.2, 0.2, 0.2);

        assertEquals(0.01732050807568878, sumArea);
    }

    @Test
    void checkSum() {
        Factorial checkSum = new Factorial();
        int sum = Factorial.checkSum(5, 7);
        int sum1 = Factorial.checkSum(54, 87);

        assertEquals(12, sum);
        assertEquals(141, sum1);
    }

    @Test
    void subtraction() {
        Factorial subtraction = new Factorial();
        int subtract = Factorial.subtraction(9, 15);

        assertEquals(6, subtract);
    }

    @Test
    void multiplication() {
        Factorial multiplication = new Factorial();
        int mult = Factorial.multiplication(24, 3);

        assertEquals(72, mult);

    }

    @Test
    void division() {
        Factorial division = new Factorial();
        int divis = Factorial.division(24, 3);

        assertEquals(8, divis);
    }

    @Test
    void compareNumbers() {
        int num1 = 10;
        int num2 = 10;
        Assertions.assertEquals(num1, num2, "Числа должны быть равны");
    }

    @Test
    void compareNumbers1() {
        int num1 = 10;
        int num2 = 5;
        Assertions.assertNotEquals(num1, num2, "Числа не должны быть равны");
    }
}
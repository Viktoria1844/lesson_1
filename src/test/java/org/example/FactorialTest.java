package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        Factorial calculator = new Factorial();

        assertEquals(1, calculator.calculateFactorial(0));
        assertEquals(1, calculator.calculateFactorial(1));
        assertEquals(2, calculator.calculateFactorial(2));
        assertEquals(6, calculator.calculateFactorial(3));
        assertEquals(24, calculator.calculateFactorial(4));
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    public void testGetAreaTriangle() {
        Factorial area = new Factorial();
        double sumArea = Factorial.getAreaTriangle(0.2, 0.2, 0.2);

        assertEquals(0.01732050807568878, sumArea);
    }

    @Test
    public void testCheckSum() {
        Factorial checkSum = new Factorial();
        int sum = Factorial.checkSum(5, 7);
        int sum1 = Factorial.checkSum(54, 87);

        assertEquals(12, sum);
        assertEquals(141, sum1);
    }

    @Test
    public void testSubtraction() {
        Factorial subtraction = new Factorial();
        int subtract = Factorial.subtraction(9, 15);

        assertEquals(6, subtract);
    }

    @Test
    public void testMultiplication() {
        Factorial multiplication = new Factorial();
        int mult = Factorial.multiplication(24, 3);

        assertEquals(72, mult);
    }

    @Test
    public void testDivision() {
        Factorial division = new Factorial();
        int divis = Factorial.division(24, 3);

        assertEquals(8, divis);
    }

    @Test
    public void testCompareNumbers() {
        int num1 = 10;
        int num2 = 10;
        Assert.assertEquals(num1, num2, "Числа должны быть равны");
    }

    @Test
    void compareNumbers1() {
        int num1 = 10;
        int num2 = 5;
        Assert.assertNotEquals(num1, num2, "Числа не должны быть равны");
    }
}
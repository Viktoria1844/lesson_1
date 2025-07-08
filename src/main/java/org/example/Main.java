package org.example;

import static org.example.Factorial.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(getAreaTriangle(1.2, 1, 0.5));
        System.out.println(checkSum(7, 5));
        System.out.println(subtraction(75, 98));
        System.out.println(multiplication(5, 7));
        System.out.println(division(25, 5));
        compareNumbers();
    }
}
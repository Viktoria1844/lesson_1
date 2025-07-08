package org.example;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static double getAreaTriangle(double side1, double side2, double side3) {
        double s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static int checkSum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtraction(int a, int b) {
        int c = b - a;
        return c;
    }

    public static int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int division(int a, int b) {
        int c = a / b;
        return c;
    }

    public static int compareNumbers() {
        int a = 5;
        int b = 24;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
        return a;
    }
}

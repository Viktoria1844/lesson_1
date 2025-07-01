package org.example;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1. Корректный массив  с суммой элементов 60 -> 60");
        String array[][] = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2"},
                {"3", "4", "5", "0"}
        };
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(array));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("2. Массив размера 4х3 -> MyArraySizeException");
        array = new String[][]{
                {"1", "2", "3", "1"},
                {"4", "5", "6", "1"},
                {"7", "8", "9", "1"}
        };
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(array));
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("3. Массив размера 3х4 -> MyArraySizeException");
        array = new String[][]{
                {"5", "7", "3"},
                {"7", "0", "1"},
                {"8", "1", "2"},
                {"18", "11", "21"}
        };
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(array));
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("4. Массив 4х4, не только числа -> MyArrayDataException");
        array = new String[][]{
                {"1", null, "3", "4"},
                {"5", ",", "6", "7"},
                {"8", "9", "0", "1"},
                {"-1", "-2", "-3", "-4"}
        };
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(array));
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("5. Массив для генерации кода и поимки -> ArrayIndexOutOfBoundsException");
        array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "0", "1", "2"},
                {"3", "4", "5", "0"}
        };
        try {
            String[] value = array[5];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e + ": Ошибка индексации массива ");
        }
    }
}
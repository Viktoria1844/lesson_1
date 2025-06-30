package org.example;

public class Array4x4 {
    public static int sum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4 || array[0].length != 4)
            throw new MyArraySizeException("Массив не 4х4: " + array.length + "x" + array[0].length);
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int c = 0; c < array.length; c++) {
                try {
                    result += Integer.parseInt(array[i][c]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + 1 + c + "]");
                }
            }
        }
        return result;
    }

    public static Integer sumWithInnerErrPrint(String[][] array) {
        try {
            if (array.length != 4 || array[0].length != 4)
                throw new MyArraySizeException("Массив не 4х4: " + array.length + "х" + array[0].length);
        } catch (MyArraySizeException e) {
            System.err.println(e);
        }
        int result = 0;
        boolean dataException = false;
        for (int i = 0; i < array.length; i++) {
            for (int c = 0; c < array.length; c++) {
                try {
                    try {
                        result += Integer.parseInt(array[i][c]);
                    } catch (NumberFormatException e) {
                        dataException = true;
                        throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + 1 + c + "]");
                    }
                } catch (MyArrayDataException e) {
                    System.err.println(e);
                }
            }
        }
        return dataException ? null : result;
    }
}

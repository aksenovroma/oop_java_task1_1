package by.bntu.fitr.noname.task1.model.logic;

import by.bntu.fitr.noname.task1.model.entity.Matrix;
import by.bntu.fitr.noname.task1.util.UserInput;

public class MatrixHandler {
    public static void fill(Matrix matrix) {
        if (matrix == null || matrix.getArr() == null) {
            return;
        }

        double arr[][] = matrix.getArr();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter elem [" + i + "][" + j + "]: ");
                arr[i][j] = UserInput.inputDouble();
            }
        }
    }

    public static void print(Matrix matrix) {
        if (matrix == null || matrix.getArr() == null) {
            return;
        }

        double arr[][] = matrix.getArr();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static int findRowWithMaxElem(Matrix matrix) {
        if (matrix == null || matrix.getArr() == null) {
            return -1;
        }

        double arr[][] = matrix.getArr();
        double max = arr[0][0];
        int iMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    iMax = i;
                }
            }
        }
        return iMax;
    }

    public static int findRowWithMinElem(Matrix matrix) {
        if (matrix == null || matrix.getArr() == null) {
            return -1;
        }

        double arr[][] = matrix.getArr();
        double min = arr[0][0];
        int iMin = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    iMin = i;
                }
            }
        }
        return iMin;
    }

    public static void replaceRows(Matrix matrix, int a, int b) {
        if (matrix == null || matrix.getArr() == null) {
            return;
        }

        if (a < 0 || b < 0) {
            return;
        }

        double arr[][] = matrix.getArr();

        if (a == b) {
            return;
        }

        double[] temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] getNumOfRowsWithZeroOnDiagonal(Matrix matrix) {
        if (matrix == null || matrix.getArr() == null) {
            return null;
        }

        double arr[][] = matrix.getArr();
        int countOfRows = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isRowWithZeroOnDiagonal(matrix, i)) {
                countOfRows++;
            }
        }

        int[] rows = new int[countOfRows];
        countOfRows = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isRowWithZeroOnDiagonal(matrix, i)) {
                rows[countOfRows] = i;
                countOfRows++;
            }
        }

        return rows;
    }

    public static boolean isRowWithZeroOnDiagonal(Matrix matrix, int i) {
        if (matrix == null || matrix.getArr() == null) {
            return false;
        }

        double[][] arr = matrix.getArr();

        if ((i < 0) || (arr[0].length <= i)) {
            return false;
        }

        return arr[i][i] == 0;
    }

    public static double maxElemInRow(Matrix matrix, int i) {
        if (matrix == null || matrix.getArr() == null) {
            return 0.0;
        }

        double[][] arr = matrix.getArr();

        if ((i < 0) || (arr[0].length <= i)) {
            return 0.0;
        }

        double max = arr[i][0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] > max) {
                max = arr[i][j];
            }
        }

        return max;
    }
}

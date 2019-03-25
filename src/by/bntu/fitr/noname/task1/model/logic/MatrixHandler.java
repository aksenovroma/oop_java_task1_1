package by.bntu.fitr.noname.task1.model.logic;

import by.bntu.fitr.noname.task1.model.entity.Matrix;
import by.bntu.fitr.noname.task1.util.UserInput;

public class MatrixHandler {
    public static void fill(Matrix matrix) {
        if (matrix != null && matrix.getMatrix() != null) {
            for (int i = 0; i < matrix.getRowCount(); i++) {
                for (int j = 0; j < matrix.getColumnCount(); j++) {
                    System.out.print("Enter elem [" + i + "][" + j + "]: ");
                    matrix.getMatrix()[i][j] = UserInput.inputDouble();
                }
            }
        }
    }

    public static void print(Matrix matrix) {
        if (matrix != null && matrix.getMatrix() != null) {
            for (int i = 0; i < matrix.getRowCount(); i++) {
                for (int j = 0; j < matrix.getColumnCount(); j++) {
                    System.out.print(matrix.getMatrix()[i][j] + " ");
                }
                System.out.print('\n');
            }
            System.out.print('\n');
        }
    }

    public static int findRowWithMaxElem(Matrix matrix) {
        int iMax = -1;

        if (matrix != null && matrix.getMatrix() != null) {
            double max = matrix.getElement(0, 0);
            iMax = 0;

            for (int i = 0; i < matrix.getRowCount(); i++) {
                for (int j = 0; j < matrix.getColumnCount(); j++) {
                    if (matrix.getMatrix()[i][j] > max) {
                        max = matrix.getMatrix()[i][j];
                        iMax = i;
                    }
                }
            }
        }
        return iMax;
    }

    public static int findRowWithMinElem(Matrix matrix) {
        int iMin = -1;

        if (matrix != null && matrix.getMatrix() != null) {
            double min = matrix.getElement(0, 0);
            iMin = 0;

            for (int i = 0; i < matrix.getRowCount(); i++) {
                for (int j = 0; j < matrix.getColumnCount(); j++) {
                    if (matrix.getMatrix()[i][j] < min) {
                        min = matrix.getMatrix()[i][j];
                        iMin = i;
                    }
                }
            }
        }
        return iMin;
    }

    public static void replaceRows(Matrix matrix, int a, int b) {
        if (matrix != null && matrix.getMatrix() != null) {
            if (!(a == b) && (a >= 0 && b >= 0)) {
                double[] temp = matrix.getMatrix()[a];
                matrix.getMatrix()[a] = matrix.getMatrix()[b];
                matrix.getMatrix()[b] = temp;
            }
        }
    }

    public static int[] getNumOfRowsWithZeroOnDiagonal(Matrix matrix) {
        int[] rows = null;

        if (matrix != null || matrix.getMatrix() != null) {
            int countOfRows = 0;

            for (int i = 0; i < matrix.getRowCount(); i++) {
                if (isRowWithZeroOnDiagonal(matrix, i)) {
                    countOfRows++;
                }
            }

            rows = new int[countOfRows];
            countOfRows = 0;

            for (int i = 0; i < matrix.getColumnCount(); i++) {
                if (isRowWithZeroOnDiagonal(matrix, i)) {
                    rows[countOfRows] = i;
                    countOfRows++;
                }
            }
        }
        return rows;
    }

    public static boolean isRowWithZeroOnDiagonal(Matrix matrix, int i) {
        if (matrix != null && matrix.getMatrix() != null) {
            if (!(i < 0) && !(matrix.getColumnCount() <= i)) {
                return matrix.getElement(i, i) == 0;
            }
        }
        return false;
    }

    public static double maxElemInRow(Matrix matrix, int i) {
        double max = Double.MIN_VALUE;

        if (matrix != null && matrix.getMatrix() != null) {
            if (!(i < 0) && !(matrix.getColumnCount() <= i)) {
                max = matrix.getElement(i, 0);

                for (int j = 0; j < matrix.getRowCount(); j++) {
                    if (matrix.getElement(i, j) > max) {
                        max = matrix.getElement(i, j);
                    }
                }
            }
        }
        return max;
    }
}

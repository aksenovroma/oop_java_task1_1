package by.bntu.fitr.noname.task1.model.entity;

import java.util.Arrays;

public class Matrix {
    private static final int ROW_DEFAULT = 2;
    private static final int COLUMN_DEFAULT = 2;

    private double[][] matrix = new double[ROW_DEFAULT][COLUMN_DEFAULT];

    public Matrix() {}

    public Matrix(int row, int col) {
        if (row >= 0 && col >= 0) {
            this.matrix = new double[row][col];
        }
    }

    public Matrix(double[][] matrix) {
        if (matrix != null) {
            this.matrix = matrix;
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        if (matrix != null) {
            this.matrix = matrix;
        }
    }

    public int getRowCount() {
        return matrix.length;
    }

    public int getColumnCount() {
        return matrix[0].length;
    }

    public double[] getRow(int index) {
        if (index >= 0 && index < matrix.length){
            return matrix[index];
        }
        return null;
    }

    public double getElement(int rowIndex, int columnIndex) {
        return matrix[rowIndex][columnIndex];
    }

    public void setElement(int rowIndex, int columnIndex, double element) {
        matrix[rowIndex][columnIndex] = element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Matrix matrix1 = (Matrix) o;
        return Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                stringBuilder.append(matrix1[j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

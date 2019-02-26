package by.bntu.fitr.noname.task1.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private int row;
    private int col;
    private double arr[][];

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.arr = new double[row][col];
    }

    public Matrix(double[][] arr) {
        if (arr != null) {
            this.row = arr.length;
            this.col = arr[0].length;
            this.arr = arr;
        }
    }

    public Matrix(int row, int col, double[][] arr) {
        this.row = row;
        this.col = col;
        this.arr = arr;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public double[][] getArr() {
        return arr;
    }

    public void setArr(double[][] arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return row == matrix.row &&
                col == matrix.col &&
                Arrays.equals(arr, matrix.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(row, col);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "row=" + row +
                ", col=" + col +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}

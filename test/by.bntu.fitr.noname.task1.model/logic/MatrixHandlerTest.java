package by.bntu.fitr.noname.task1.model.logic;

import by.bntu.fitr.noname.task1.model.entity.Matrix;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MatrixHandlerTest {
    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix matrix3;

    @BeforeTest
    public void setMatrix() {
        double[][] arr1 = {{0, 3, 7}, {1, 4, 3}, {-1, 3, 0}};
        double[][] arr2 = {{-1, 3, 0}, {1, 4, 3}, {0, 3, 7}};
        matrix1 = new Matrix(arr1);
        matrix2 = new Matrix(null);
        matrix3 = new Matrix(arr2);
    }

    @Test
    public void findRowWithMaxElemTest() {
        int expected1 = 0;
        int actual1 = MatrixHandler.findRowWithMaxElem(matrix1);

        int expected2 = -1;
        int actual2 = MatrixHandler.findRowWithMaxElem(null);

        int expected3 = -1;
        int actual3 = MatrixHandler.findRowWithMaxElem(matrix2);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void findRowWithMinElemTest() {
        int expected1 = 2;
        int actual1 = MatrixHandler.findRowWithMinElem(matrix1);

        int expected2 = -1;
        int actual2 = MatrixHandler.findRowWithMinElem(null);

        int expected3 = -1;
        int actual3 = MatrixHandler.findRowWithMinElem(matrix2);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void maxElemInRowTest() {
        double expected1 = 7.0;
        double actual1 = MatrixHandler.maxElemInRow(matrix1, 0);

        double expected2 = 0.0;
        double actual2 = MatrixHandler.maxElemInRow(matrix1, -1);

        double expected3 = 0.0;
        double actual3 = MatrixHandler.maxElemInRow(matrix1, 5);

        double expected4 = 0.0;
        double actual4 = MatrixHandler.maxElemInRow(null, 0);

        double expected5 = 0.0;
        double actual5 = MatrixHandler.maxElemInRow(matrix2, 0);

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
    }

    @Test
    public void isRowWithZeroOnDiagonalTest() {
        boolean actual1 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 0);
        boolean actual2 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 1);
        boolean actual3 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, -1);
        boolean actual4 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 3);
        boolean actual5 = MatrixHandler.isRowWithZeroOnDiagonal(null, 1);
        boolean actual6 = MatrixHandler.isRowWithZeroOnDiagonal(matrix2, 1);

        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
        Assert.assertFalse(actual3);
        Assert.assertFalse(actual4);
        Assert.assertFalse(actual5);
        Assert.assertFalse(actual6);

    }

    @Test
    public void replaceRowsTest() {
        double[][] expected1 = matrix3.getArr();
        MatrixHandler.replaceRows(matrix1, 0, 2);
        double[][] actual1 = matrix1.getArr();

        boolean result1 = Arrays.deepEquals(expected1, actual1);

        double[][] expected2 = matrix3.getArr();
        MatrixHandler.replaceRows(matrix1, 0, 1);
        double[][] actual2 = matrix1.getArr();

        boolean result2 = Arrays.deepEquals(expected2, actual2);

        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }
}

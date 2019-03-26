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
        double[][] arr1 = {
                {0, 3, 7},
                {1, 4, 3},
                {-1, 3, 0}};
        double[][] arr2 = {
                {-1, 3, 0},
                {1, 4, 3},
                {0, 3, 7}};
        matrix1 = new Matrix(arr1);
        matrix2 = new Matrix(null);
        matrix3 = new Matrix(arr2);
    }

    @Test
    public void findRowWithMaxElem() {
        int expected1 = 0;
        int actual1 = MatrixHandler.findRowWithMaxElem(matrix1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void findRowWithMaxElemNUllMatrix() {
        int expected2 = -1;
        int actual2 = MatrixHandler.findRowWithMaxElem(null);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void findRowWithMaxElemNegative() {
        int expected3 = 0;
        int actual3 = MatrixHandler.findRowWithMaxElem(matrix2);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testFindRowWithMinElem() {
        int expected1 = 2;
        int actual1 = MatrixHandler.findRowWithMinElem(matrix1);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testFindRowWithMinElemNullMatrix() {
        int expected2 = -1;
        int actual2 = MatrixHandler.findRowWithMinElem(null);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testFindRowWithMinElemNegative() {
        int expected3 = 0;
        int actual3 = MatrixHandler.findRowWithMinElem(matrix2);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testMaxElemInRow() {
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
    public void testMaxElemInRowNegativeArgument() {
        double expected2 = 0.0;
        double actual2 = MatrixHandler.maxElemInRow(matrix1, -1);

        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testMaxElemInRowWrongArgument() {
        double expected3 = 0.0;
        double actual3 = MatrixHandler.maxElemInRow(matrix1, 5);

        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void testMaxElemInRowNullMatrix() {
        double expected4 = 0.0;
        double actual4 = MatrixHandler.maxElemInRow(null, 0);

        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void testMaxElemInRowZeroArgument() {
        double expected5 = 0.0;
        double actual5 = MatrixHandler.maxElemInRow(matrix2, 0);

        Assert.assertEquals(expected5, actual5);
    }

    @Test
    public void testIsRowWithZeroOnDiagonalPositive() {
        boolean actual1 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 0);

        Assert.assertTrue(actual1);
    }

    @Test
    public void testIsRowWithZeroOnDiagonalNegative() {
        boolean actual2 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 1);

        Assert.assertFalse(actual2);
    }

    @Test
    public void testIsRowWithZeroOnDiagonalNegativeArgument() {
        boolean actual3 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, -1);

        Assert.assertFalse(actual3);
    }

    @Test
    public void testIsRowWithZeroOnDiagonalLargeArgument() {
        boolean actual4 = MatrixHandler.isRowWithZeroOnDiagonal(matrix1, 3);

        Assert.assertFalse(actual4);
    }

    @Test
    public void testIsRowWithZeroOnDiagonalNullMatrix() {
        boolean actual5 = MatrixHandler.isRowWithZeroOnDiagonal(null, 1);

        Assert.assertFalse(actual5);
    }

    @Test
    public void testReplaceRows() {
        double[][] expected1 = matrix3.getMatrix();
        MatrixHandler.replaceRows(matrix1, 0, 2);
        double[][] actual1 = matrix1.getMatrix();

        boolean result1 = Arrays.deepEquals(expected1, actual1);

        Assert.assertTrue(result1);
    }

    @Test
    public void testReplaceRowsNegative() {
        double[][] expected2 = matrix3.getMatrix();
        MatrixHandler.replaceRows(matrix1, 0, 1);
        double[][] actual2 = matrix1.getMatrix();

        boolean result2 = Arrays.deepEquals(expected2, actual2);

        Assert.assertFalse(result2);
    }
}

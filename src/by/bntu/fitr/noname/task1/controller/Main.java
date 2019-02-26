package by.bntu.fitr.noname.task1.controller;

import by.bntu.fitr.noname.task1.model.entity.Matrix;
import by.bntu.fitr.noname.task1.model.logic.MatrixHandler;
import by.bntu.fitr.noname.task1.util.PrinterCreator;
import by.bntu.fitr.noname.task1.util.UserInput;
import by.bntu.fitr.noname.task1.view.Printable;
import by.bntu.fitr.noname.task1.view.PrinterType;

public class Main {
    public static void main(String[] args) {
        Printable printer = PrinterCreator.create(PrinterType.CONSOLE);

        printer.print("Enter count of rows in array: ");

        int row = UserInput.inputInt();

        printer.print("Enter count of columns in array: ");

        int col = UserInput.inputInt();

        Matrix matrix = new Matrix(row, col);

        MatrixHandler.fill(matrix);
        MatrixHandler.print(matrix);

        int a = MatrixHandler.findRowWithMaxElem(matrix);
        int b = MatrixHandler.findRowWithMinElem(matrix);

        MatrixHandler.replaceRows(matrix, a, b);
        MatrixHandler.print(matrix);

        int[] rows = MatrixHandler.getNumOfRowsWithZeroOnDiagonal(matrix);

        for (int i : rows){
            printer.print("Row №" + i + " (max elem = " + MatrixHandler.maxElemInRow(matrix, i) + ")");
        }
    }
}

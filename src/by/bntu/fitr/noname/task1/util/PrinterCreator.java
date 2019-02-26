package by.bntu.fitr.noname.task1.util;


import by.bntu.fitr.noname.task1.view.ConsolePrint;
import by.bntu.fitr.noname.task1.view.FilePrint;
import by.bntu.fitr.noname.task1.view.Printable;
import by.bntu.fitr.noname.task1.view.PrinterType;

public class PrinterCreator {
    public static Printable create(PrinterType printerType){
        Printable printer = null;

        switch (printerType){
            case CONSOLE:{
                printer = new ConsolePrint();
                break;
            }
            case FILE:{
                printer = new FilePrint();
                break;
            }
        }

        return printer;
    }
}

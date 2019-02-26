package by.bntu.fitr.noname.task1.view;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrint implements Printable{
    @Override
    public void print(Object o) {
        if (o == null){
            return;
        }

        try (FileWriter fileWriter = new FileWriter("output/result.txt", true)){
            fileWriter.write(o.toString() + '\n');
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

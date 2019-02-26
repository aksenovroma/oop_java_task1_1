package by.bntu.fitr.noname.task1.view;

public class ConsolePrint implements Printable{
    @Override
    public void print(Object o){
        if (o == null){
            return;
        }

        System.out.println(o);
    }
}

package CodePractice2.Codeday46_MergeConcepts;

import java.util.Vector;

public class Program03 {
    public static void main(String[] args) {
        Vector<String > list=new Vector<String>();
        list.add("a");
        list.add("b");

        Runnable r1=()->{
            for(String value:list) {
                System.out.print(value+" ");
            }
        };
        Runnable r2=()->{
            list.add("c");
            list.add("d");
        };
        new Thread(r2).start();
        new Thread(r1).start();

    }
}

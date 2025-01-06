package CodePractice2.Codeday46_MergeConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionProgram006 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList();
        al.add(1);
        al.add(true);
        al.add("hello");
        al.add(2, true);

        System.out.println(al);

    }
}
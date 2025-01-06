package CodePractice2.Codeday46_MergeConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionProgram002 {
    public static void main(String[] args) {
        Object arr[]= {1,"hello",'a',true,null};
        List<Object> list=Arrays.asList(arr);//It will create list unmodificable/immutable.
        list.add(1,"String");
        System.out.println(list);

    }
}

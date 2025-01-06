package CodePractice2.Codeday46_MergeConcepts;

import java.util.Vector;

public class CollectionProgram001 {
    public static void main(String[] args) {
        Vector<Object> v1=new Vector<Object>();
        v1.add(10);
        v1.add("hello");
        v1.add('a');
        v1.add(true);
        v1.add("hello");
        // logic for removing
        v1.remove((Character)'a');
//        v1.remove('a');//It will take ascii value i.e 97 that;s why we will get exception i.e ArrayIndexOutOFBound
        System.out.print("Capacity :"+v1.capacity()+" ");
        System.out.print("size :"+v1.size()+" ");
        System.out.print("Element :"+v1);

    }
}

package CodePractice2.Codeday43_Collection.CollectionDay1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Array
{
    public static void main(String args[])
    {
//        int array[] = new int [5];
//        for (int i = 5; i > 0; i--)
//            array[5-i] = i;
//        Arrays.fill(array, 1, 4, 8);
//        for (int i = 0; i < 5 ; i++)
//            System.out.print(array[i]);

        //

//        ArrayList<String> list = new ArrayList<>();
//        list.add(12);
//        list.add(16);
//        list.add(34);
//
//        list.add(78);
//        list.remove(Integer.valueOf(16));
//
//        System.out.println(list);

        ArrayList obj = new ArrayList();
        obj.add("A");
        obj.add("D");
        obj.ensureCapacity(3);
        obj.trimToSize();
       obj.ensureCapacity(100);


        List list1 = new ArrayList();
        List list2 = list1;
        list1.add("M");
        list1.add("E");

        list1.add("R");
        list1.add("I");
        list1.add("T");
        System.out.format("%s", list1);
        System.out.format("%s", list2);
        System.out.println();
        List list = new ArrayList();
        Collections.addAll(list, "C", "C++", "C#", "JAVA");
        System.out.println("1st "+list);
        String[] strs = {".Net", "UNIX"};
        Collections.addAll(list, strs);
        System.out.println(list);
        Collections.addAll(list, list);
        System.out.println(list);

        ArrayList obj2 = new ArrayList();
        obj2.add("A");obj2.add("A");obj2.add("A");obj2.add("A");
        obj2.ensureCapacity(3);
        System.out.println(obj2.size());
    }
}

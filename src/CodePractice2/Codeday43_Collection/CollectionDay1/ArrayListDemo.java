package CodePractice2.Codeday43_Collection.CollectionDay1;

import java.util.ArrayList;
import java.util.List;

class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList obj1 = new ArrayList();
        ArrayList obj2 = new ArrayList();
        obj1.add("A");
        obj1.add("B");
        obj2.add("A");
        obj2.add(1, "B");
        System.out.println(obj1.equals(obj2));

// 7
        List<String> list1 = new ArrayList<String>();
        list1.add("Patna");
        list1.add(0, "New York");
        list1.add("Mumbai");
        list1.add(2, "Sydney");
        System.out.println(list1);

        //8

        List<String> list = new ArrayList<String>();
        list.add("Orange");
        list.add(0, "Banana");

        ArrayList<String> arList = new ArrayList<>();
        arList.add("Apple");
        list.add("Grapes");
        list.addAll(3, arList);
        System.out.println(list);

        //9

        ArrayList<String> list9 = new ArrayList<String>();
        list9.add(null);
        list9.add(0, "A");
        list9.add(2, "B");
        list9.add(1, "C");
        System.out.println(list9);

        //11

        ArrayList<String> list11 = new ArrayList<String>();
        list11.add(null);
        list11.add(0, "A");
        list11.add(null);
        list11.add(2, "B");
        list11.add("20");
        list11.add(1, "C");
        System.out.println(list11);

    }
}


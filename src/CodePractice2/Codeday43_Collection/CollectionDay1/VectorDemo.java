package CodePractice2.Codeday43_Collection.CollectionDay1;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo{
public static void main(String args[]){
        Vector obj = new Vector(4,2);
    System.out.println(obj.capacity());
        obj.addElement(3);
        obj.addElement(2);
        obj.addElement(5);
        obj.insertElementAt(8, 2);
        System.out.println(obj.elementAt(1));
        System.out.println(obj.capacity());
        System.out.println(obj);
    obj.removeAll(obj);
    System.out.println(obj.isEmpty());

//    ArrayList<String> list = new ArrayList<>();
//    list.add(12);
//    list.add(16);
//    list.add(34);
//    list.add(78);
//    list.remove(Integer.valueOf(16));
//    System.out.println(list);

        }
        }
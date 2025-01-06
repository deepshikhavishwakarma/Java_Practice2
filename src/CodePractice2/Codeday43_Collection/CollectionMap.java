package CodePractice2.Codeday43_Collection;

import java.util.*;

public class CollectionMap {
    /*public static void main(String[] args) {
//        Set set = new TreeSet();
//
//        set.add("“2”");
//
//        set.add("“3”");
//
//        set.add("“1”");
//
//        Iterator it = set.iterator();
//
//        while (it.hasNext())
//
//            System.out.print(it.next() + " ");



       *//* Set h = new HashSet();

        h.add("“One”");

        h.add("“Two”");

        h.add("“Three”");

        h.add("“Four”");

        h.add("“One”");

        h.add("“Four”");

        List l = new ArrayList();

        l.add("“One”");

        l.add("“Two”");

        l.add("“Three”");

        h.retainAll(l);

        System.out.println("“Size:” "+ l.size() + h.size());
*//*

//        TreeSet<Object> s = new TreeSet<Object>();
//
//        s.add(1);
//        s.add(12);
//        s.add(16);
//
//        System.out.println("Test");
////        s.add(99.9);
//
////        s.add(96.9);
//
//        for (int i = 0; i<s.size();i++) {
//
//            System.out.print(s.pollFirst()+" ");
//        }


    }*/
    public static double sumOfList(List<? extends Number> list)

    {
        double s = 0.0;
        for (Number n : list)

            s += n.doubleValue();

        return s;

    }

    public static void main(String args[])

    {

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);

        System.out.println(sumOfList(ld));

    }

}

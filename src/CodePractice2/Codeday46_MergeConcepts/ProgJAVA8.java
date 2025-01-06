package CodePractice2.Codeday46_MergeConcepts;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProgJAVA8 {


    public static void main(String[] args) {
//        1st
       List<Integer> list1=List.of(3,5,4,2,7,6,5,8,3,5,7);
       Optional num1 = list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(num1);


       //2nd
        List<Integer> list2= List.of(1,2,3,4,5);
     Integer num2=list2.stream().map(x->x*x).reduce(0,(a,b)->a+b);
        System.out.println(num2);
        System.out.println();
        //3rd
        List<String> list3 = List.of("banana","apple","cherry","date","grape");
        list3.stream().sorted().forEach(System.out::println);

        System.out.println();

        //4th
        List<Integer> list4=List.of(1,2,3,4,5);
        list4.stream().map(x->x*2).forEach(System.out::println);
        System.out.println();
        //
        List<Integer> list5=List.of(1,2,3,2,4,5,4);
        list5.stream().distinct().forEach(System.out::println);

        System.out.println();
        Map<Integer,List<String>> map1=list3.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map1);
    }
}

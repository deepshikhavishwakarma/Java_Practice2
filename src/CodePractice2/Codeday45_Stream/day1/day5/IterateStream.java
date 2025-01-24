package CodePractice2.Codeday45_Stream.day1.day5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateStream {
    public static void main(String[] args) {
        Stream.iterate(11,n->n+2).limit(10).forEach(System.out::println);
        Stream.iterate(2,n->n+1).filter(x->x%2==0).limit(10).forEach(System.out::println);


//       Stream.generate()

        Stream<String> str = Stream.of("Sita", "Geeta", "Rama", "Sohan", "Divya", "Pawni", "AbhiShree");
         //sorting based on length
        //        List<Integer> collect = str.map(x -> x.length()).sorted().collect(Collectors.toList());
        //        collect.forEach(System.out::println);
        //sorting in descending order
        List<String> collect1 = str.sorted((x1,x2)->x2.compareTo(x1)).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> s1 = List.of("Ram", "Sita", "Geeta");
        List<String> s2 = List.of("Mohan", "Sita", "Maya");
        List<String> s3 = List.of("Rma", "neetu", "deepu");

        List<List<String>> s11 = List.of(s1, s2, s3);
        s11.forEach(System.out::println);
        List<String> collect = s11.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}

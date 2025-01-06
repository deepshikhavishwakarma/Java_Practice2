package CodePractice2.Codeday45_Stream.day1.day3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.io.ObjectInputFilter.merge;


public class squareOdd {
    public static void main(String[] args) {
        //1 Filtering and Mapping:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x->x%2!=0).map(x->x*x).forEach(System.out::println);

       //2 Grouping and Counting
        List<String> strings = List.of("apple", "banana", "orange", "grape", "pear");
        Map<Integer,Long> map = new HashMap<>();
        strings.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())).forEach(map::put);
        System.out.println("Length -> Count:");
        map.forEach((length,count)-> System.out.println(length+" -> "+count));


        //3 sorting

        List<String> string2 = List.of("apple", "banana", "orange", "grape", "pear");
        string2.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
//        string2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//both method can be applicable


        //5 Flattening List:
        List<List<Integer>> list = List.of(List.of(1,2,3),List.of(2,3,4,5),List.of(4,5,6));
        List<Integer> newList = list.stream().flatMap(x->x.stream()).distinct().collect(Collectors.toList());
        System.out.println(newList);

        //8 Sorting Map:
       HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A",10);
        map2.put("B",5);
        map2.put("C",20);
        map2.put("D",15);
    List<Map.Entry<String,Integer>> m= map2.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).toList();
//        LinkedHashMap map3 = new LinkedHashMap<>(m);
       System.out.println("Using HashMap"+m);

       //10 Merging Maps
       Map<String,Integer> map3 = new HashMap<>();
       map3.put("A", 10);
       map3.put("B", 20);
       map3.put("C", 30);
       Map<String,Integer> map4 = new HashMap<>();
       map4.put("B", 5);
       map4.put("C", 15);
       map4.put("D", 25);

       map4.forEach((x,y)->map3.merge(x,y,Integer::sum));
        System.out.println(map3);

////        System.out.println("Merged Map for Test Case 1:");
////        Map<String, Integer> mergedMap1=Stream.concat(map3)
//
//
////       Map<String,Integer> map1=Stream.concat(map3.entrySet().stream(),map4.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,Integer::sum));
//  //map2.entrySet().forEach(System.out::println);
////     flatMap(x->x.entrySet().stream()).collect(Collectors.toMap(
////             Map.Entry::getKey,
////             Map.Entry::getValue,
////                     (x,y)->x,
////             LinkedHashMap::new
//
//    // ));
////        System.out.println("result..."+map1);
//
//        Map<String, Integer> map1 = Stream.concat(map3.entrySet().stream(), map4.entrySet().stream())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,   // Key from each entry
//                        Map.Entry::getValue, // Value from each entry
//                        Integer::sum         // Merge function to handle duplicate keys
//                ));
//
//        // Printing the merged map
//        map1.forEach((key, value) -> System.out.println(key + " -> " + value));
//
//
//


    }


}

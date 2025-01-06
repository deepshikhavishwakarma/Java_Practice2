package CodePractice2.Codeday45_Stream.day1.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMap {
    public static void main(String[] args) {
        Map<String,Integer> map3 = new HashMap<>();
        map3.put("A", 10);
        map3.put("B", 20);
        map3.put("C", 30);
        Map<String,Integer> map4 = new HashMap<>();
        map4.put("B", 5);
        map4.put("C", 15);
        map4.put("D", 25);



//       Map<String,Integer> map1=Stream.concat(map3.entrySet().stream(),map4.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,Integer::sum));
        //map2.entrySet().forEach(System.out::println);
//     flatMap(x->x.entrySet().stream()).collect(Collectors.toMap(
//             Map.Entry::getKey,
//             Map.Entry::getValue,
//                     (x,y)->x,
//             LinkedHashMap::new

        // ));
//        System.out.println("result..."+map1);

        Map<String, Integer> map1 = Stream.concat(map3.entrySet().stream(), map4.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,   // Key from each entry
                        Map.Entry::getValue, // Value from each entry
                        (x,y)->x+y         // Merge function to handle duplicate keys
                ));

        // Printing the merged map
        map1.forEach((key, value) -> System.out.println(key + " -> " + value));





    }
}

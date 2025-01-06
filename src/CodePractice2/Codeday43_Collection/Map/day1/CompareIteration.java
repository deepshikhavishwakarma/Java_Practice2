package CodePractice2.Codeday43_Collection.Map.day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompareIteration {
    private static void compareIterationOrder(){
        System.out.println("HashMap iteration order:");
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(3,"Three");
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(4,"Four");
        map1.put(5,"Five");

        for (Map.Entry<Integer,String> entry:map1.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("\nLinkedHashMap iteration order:");
        Map<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(2,"Two");
        map2.put(1,"One");
        map2.put(3,"Three");
        map2.put(4,"Four");
        map2.put(5,"Five");
        for (Map.Entry<Integer,String> entry:map2.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        compareIterationOrder();
    }
}

package CodePractice2.Codeday43_Collection.Map.day1;

import java.util.HashMap;
import java.util.Map;

public class MergeHAshMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Apple",5);
        map1.put("Banana",24);
        map1.put("Mango",66);
        map1.put("Litchi",24);
        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("potato",67);
        map2.put("Tomato",22);
        map2.put("Mango",66);
        map2.put("cabbage",56);
        map2.put("ginger",89);
        map2.put("chili",90);
        map1.putAll(map2);
        for (Map.Entry<String,Integer> entry : map1.entrySet()) {
            System.out.println( entry.getKey() + "  " + entry.getValue());
        }
        System.out.println("After using putIfAbsent:");
        System.out.println(map1.putIfAbsent("cabbage",56));
        System.out.println(map1);
        System.out.println("After using replace:");
        System.out.println(map1.replace("Mango",690));
        System.out.println(map1);
        System.out.println("After using remove:");
        map1.remove("Litchi",24);
        System.out.println(map1);
    }
}

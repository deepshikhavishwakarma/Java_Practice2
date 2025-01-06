package CodePractice2.Codeday43_Collection.Map.day1;

import java.util.HashMap;
import java.util.Map;

public class StudentIDManagement {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("John",101);
        map1.put("Alice",102);
        System.out.println("Initial : ");
        for (Map.Entry<String,Integer> entry:map1.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("Updated Records after adding Bob:");
        map1.putIfAbsent("Bob",103);
        map1.putIfAbsent("John",104);


        for (Map.Entry<String,Integer> entry:map1.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

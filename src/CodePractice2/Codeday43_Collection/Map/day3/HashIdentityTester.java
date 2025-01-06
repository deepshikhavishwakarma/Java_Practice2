package CodePractice2.Codeday43_Collection.Map.day3;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashIdentityTester {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "efg";
        String s3 = new String("abc");
        String s4 = new String("efg");
        HashMap<String,String> hm = new HashMap<>();
        hm.put(s1,"value1");
        hm.put(s2,"value2");
        hm.put(s3,"value3");
        hm.put(s4,"value4");

        IdentityHashMap<String,String> Im = new IdentityHashMap<>();
        Im.put(s1,"value1");
        Im.put(s2,"value2");
        Im.put(s3,"value3");
        Im.put(s4,"value4");

        System.out.println(hm);
        System.out.println(Im);
    }
}

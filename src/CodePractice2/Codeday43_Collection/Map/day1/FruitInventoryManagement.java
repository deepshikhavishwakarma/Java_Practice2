package CodePractice2.Codeday43_Collection.Map.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FruitInventoryManagement {
    public static void main(String[] args) {
        HashMap<String,Integer> fruits = new HashMap<>();
        fruits.put("Apple",50);
        fruits.put("Banana",30);
        fruits.put("Orange",20);
        Set set = fruits.entrySet();
        Iterator itr = set.iterator();
        while ((itr.hasNext())){
            Map.Entry entry= (Map.Entry)itr.next();
            System.out.println("Added "+entry.getKey()+" "+entry.getValue());

        }
        if(!fruits.isEmpty()){
            System.out.println("Total number of entries: "+fruits.size());
            System.out.println("HashMap is not empty.");
        }

        System.out.println();
        System.out.println("Quantity of Apple : "+fruits.get("Apple"));
        System.out.println("Quantity of Banana : "+fruits.get("Banana"));
        System.out.println();
        if(fruits.containsKey("Orange")){
            System.out.println("Orange exists in the records.");
        }
        if (!fruits.containsKey("Mango")) {
            System.out.println("Mango does not exist in the records.");
        }
        if (fruits.containsValue(20)) {
            System.out.println();
            System.out.println("Quantity 20 exists in the records.");
        }
        if (!fruits.containsValue(100)) {
            System.out.println("Quantity 100 does not exist in the records.");
        }


    }
}

package CodePractice2.Codeday43_Collection.Map.day2;

import java.util.HashMap;
import java.util.Map;

class EmployeeDetails{
    public static Map<Character,Character> getEmpDetails(String[] arr){
        Map<Character,Character> map=new HashMap<>();
        for (String str:arr){
           map.put(str.charAt(0),str.charAt(str.length()-1));
        }


        return map;
    }
}
public class EmployeeTester {
    public static void main(String[] args) {
        String[] str = {"Ram","Murli","Rohit","Mayank","Lalit"};
        System.out.println(EmployeeDetails.getEmpDetails(str));
    }
}

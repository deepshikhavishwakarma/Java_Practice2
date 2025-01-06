package CodePractice2.Codeday43_Collection.Map.day2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentDetails{
    public static Map<Integer,String> getStudentDetails(List<String> str){
       Map<Integer,String> map = new HashMap<>();

       for(String list : str){
           int sum=0;
           String str2="";
           char[] ch = list.toCharArray();

           for(int i=0;i<ch.length;i++){
               if(Character.isAlphabetic(ch[i])){
                   str2+=ch[i];
               }else{
                   sum+=ch[i]-48;
               }
           }
           map.put(sum,str2);
       }
       return map;
    }
}
public class StudentTester {
    public static void main(String[] args) {
        List<String> list = List.of("Ra26j2a6", "A33ru7n8", "R0o87hi2t", "A7n9k2i1t");
        System.out.println(StudentDetails.getStudentDetails(list));
    }
}

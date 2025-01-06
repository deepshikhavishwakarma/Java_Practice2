package CodePractice2.Codeday43_Collection.Map.day3;

import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s1 = "AAAaaa";
        Map<Character,Integer> map = new LinkedHashMap<>();

        char[] ch = s1.toCharArray();
        System.out.println(Arrays.toString(ch));
       for(int i=0;i<ch.length;i++){
            int count=1;
           if(Character.isLetterOrDigit(ch[i]) && ch[i]!=' ') {
            for(int j=i+1;j<ch.length;j++){

                    if (ch[i] == ch[j]) {
                        count++;
                        ch[j] = '*';
                    }
                    map.put(ch[i],count);
            }
           }
       }
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           System.out.println("'"+entry.getKey()+"' occurs "+entry.getValue()+" times");
       }

    }
}

package CodePractice2.Codeday43_Collection.Map.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PalindromeChecker{
    public static Map<String, Boolean> checkPalindromes(List<String> str){
        Map<String,Boolean> map = new HashMap<>();
        for (String str2:str) {
            boolean isPalin = PalindromeChecker.isPalindrome(str2);
             map.put(str2,isPalin);
        }
        return map;
    }
    public static boolean isPalindrome(String str){
        char[] ch = str.toCharArray();
        int l = ch.length-1;
        int s=0;
        while(s<l) {
            if (ch[s] != ch[l]) {

                return false;
            }
            s++;
            l--;
        }

        return true;
    }
}

public class PalindromeTester {
    public static void main(String[] args) {
    List<String> list = List.of("abba", "radar", "java", "999", "level", "coding");
    List<String> list1 = List.of("madam", "racecar", "hello", "12321", "noon", "world");

    List<String> list2 = List.of("deed", "reviver", "python", "121", "rotor", "algorithm");
        Map<String,Boolean> map = PalindromeChecker.checkPalindromes(list);
        System.out.println(map); System.out.println();
        Map<String,Boolean> map2 = PalindromeChecker.checkPalindromes(list1);
        System.out.println(map2); System.out.println();
        Map<String,Boolean> map3 = PalindromeChecker.checkPalindromes(list2);
        System.out.println(map3);
    }
}

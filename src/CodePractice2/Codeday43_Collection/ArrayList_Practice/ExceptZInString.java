package CodePractice2.Codeday43_Collection.ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

/*
* Q2)
Given a list of strings, return a list of the strings from a method, omitting any
string that contains a "z".


Input as :
strings = ["aaa", "bbb", "aza"]
Output as:
["aaa", "bbb"]

Input as :
strings = ["hziz", "hzello", "hi"]
Output as:
["hi"]

Input as :
strings = ["hello", "howz", "are", "youz"]
Output as:
["hello", "are"]

* */
public class ExceptZInString {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("aaa");
        l1.add("azaa");
        l1.add("zaa");
        l1.add("ba");
        l1.add("ctt");
        l1.add("rza");
        l1.add("a");
        l1.add("az");
        for (String str:l1) {
            if(!str.contains("z")){
                System.out.println(str);
            }
        }
    }
}

package CodePractice2.Logic.Arrays.Tasks.String_Task_02;

import java.util.Arrays;

/*
* Que-5
______________________
Write a java program to reverse the String words on it's own position?

Input as: " hello everyone how are you "
Output as: " olleh enoyreve who era uoy"
*
* */
public class ReverseString {
    public static String reverseStr(String[] str) {
        System.out.println(Arrays.toString(str));
        return "";
    }

    public static void main(String[] args) {
   String s1 = " hello everyone how are you .";
   System.out.println("Input as : "+s1);
   String[] str = s1.split(" ");
   String s2 = ".";

        for (String str1:str) {
           char[] ch = str1.toCharArray();
           for(int i = ch.length-1;i>=0;i--){
               if(ch[i]!='.'){
               s2+=ch[i];}
           }
           s2+=" ";

        }
        System.out.println("Output as : "+s2);

}}

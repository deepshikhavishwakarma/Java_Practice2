//package CodePractice2.Logic.Arrays.Tasks.String_Task_02;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
///*
//* Que-3
//___________________
//Write a program to print all permutations of String in Java.
//Let's say a given string is "abc" so all possible permutations of this string will be "abc", "acb", "bac", "bca", "cab", "cba"
//*
//* */
//public class PermutationString {
//    public static void permute(String str,int s,int e){
//        char[] ch1={};
//        if(str.length()==1){
//            System.out.println(str);;
//        }else {
////            char[] ch = str.toCharArray();
//            for(int i=1;i<e;i++){
//                str = swap(str, s, i);
//                permute(str, s + 1, e);
//                str = swap(str, s, i);
//            }
//
//        }
//
//    }
//    public static String swap(String s,int i,int j){
//
//        char[] ch = s.toCharArray();
//        char temp = s.charAt(i);
//        s.charAt(i) = s.charAt(j);
//        s.charAt(j) = temp;
//
//        return ch;
//    }
//
//
//    public static void main(String[] args) {
//
//     String str = "abc";
//     permute(str,0,str.length()-1);
//
//
//
//    }
//}

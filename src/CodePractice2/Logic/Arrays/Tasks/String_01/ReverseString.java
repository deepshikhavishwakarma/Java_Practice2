package CodePractice2.Logic.Arrays.Tasks.String_01;

import java.util.Arrays;
//reverse the string ?
public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Hi Deep How are you ?";
        System.out.println(s1);
        String[] string  = s1.split(" ");
        for(int i= string.length-1;i>=0;i--){
           System.out.print(string[i]+" ");
        }

    }
}

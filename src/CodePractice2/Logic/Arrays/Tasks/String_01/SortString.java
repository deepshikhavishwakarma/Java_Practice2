package CodePractice2.Logic.Arrays.Tasks.String_01;

import java.lang.reflect.Array;
import java.util.Arrays;

//sort the string in ascending and descending order?
public class SortString {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Deepshikha");
        System.out.println("Original String  "+s1);
        char[] s2 = s1.toString().toCharArray(); //convert stringBuilder content to char Array
        System.out.println("Char array of Original String: "+Arrays.toString(s2));
        for(int i= 0;i<s2.length-1;i++){
            for(int j = i+1;j<s2.length;j++) {
                if (s2[i] > s2[j]) {
                    char temp = s2[i];
                    s2[i] = s2[j];
                    s2[j] = temp;
                }
            }
        }
        System.out.println("Char array in ascending order "+Arrays.toString(s2));
        StringBuilder s3 = new StringBuilder(new String(s2));
        System.out.println("Sorted string in ascending order  "+s3);


        //Sorting in descending order
        for(int i= 0;i<s2.length-1;i++){
            for(int j = i+1;j<s2.length;j++) {
                if (s2[i] < s2[j]) {
                    char temp = s2[i];
                    s2[i] = s2[j];
                    s2[j] = temp;
                }
            }
        }

        System.out.println("Char array in descending order: "+Arrays.toString(s2));
        StringBuilder s4 = new StringBuilder(new String(s2));
        System.out.println("Sorted string in dscending order  "+s4);


    }
}

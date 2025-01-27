package CodePractice2.Logic.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "NIT";
        char[] c1 = s1.toCharArray();
        System.out.print("Using ordinary for loop  : ");
        for(int i=c1.length-1;i>=0;i--){
            System.out.print(c1[i]);
        }
        System.out.println();
        System.out.print("Using Stream API :   ");
        List<char[]> collect = Stream.of(c1).collect(Collectors.toList());
        Collections.reverse(collect);
        collect.forEach(x-> System.out.println(Arrays.toString(x)));
//        System.out.println();
        System.out.print("Using String class : ");
        String s3 = new StringBuilder(new String(c1)).reverse().toString();
        System.out.println(s3);

    }
}

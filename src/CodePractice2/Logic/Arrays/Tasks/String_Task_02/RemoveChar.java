package CodePractice2.Logic.Arrays.Tasks.String_Task_02;

import java.util.Arrays;

/*
* Que-2
__________________
Write a Java program that removes all occurrences of a specified character from a given string without using any predefined methods from the String class (such as replace(), replaceAll(), etc.). The program should:

Take a string as input, such as "Hello everyone".
Define a character to remove, for example 'e'.
Output the original string and the modified string, which excludes all instances of the specified character.
Example:

Input:
String: "Hello everyone"
Character to remove: 'e'

Expected Output:
Original String: "Hello everyone"
Modified String: "Hllo vryon"
*
* */
public class RemoveChar {
    public static void main(String[] args) {
        String s1 = "Hello Everyone How are you ?".trim();
        char[] ch = s1.toCharArray();
        System.out.println(Arrays.toString(ch));
        String string = "";
        for (int i=0;i<ch.length;i++){
            if(ch[i]!='e' && ch[i]!='E'){
                string+=ch[i];

            }

        }
        System.out.println(string);
    }
}

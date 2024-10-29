package CodePractice2.Logic.Arrays.Tasks.String_Task_02;
/*
* Que-4
____________________
Write a program to swap two string variables without using a third variable in Java.
Suppose we have two strings, String a = "Coding" and String b = "Program"
After swapping, the result should be a = "Program" and b = "Coding"
*
* */
public class SwapString {
    public static void main(String[] args) {
        String s1 = new String("Program");


        String s2 = new String("Coding");
        System.out.println("Before Swapping\na = "+s1+" b = "+s2);
        s1 = s1+s2;
        s2= s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swapping\na = "+s1+" b = "+s2);

    }
}

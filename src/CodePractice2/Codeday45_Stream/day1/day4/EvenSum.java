package CodePractice2.Codeday45_Stream.day1.day4;

import java.util.*;
import java.util.stream.Collectors;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 67, 8, 9, 12, 4, 4, 3);
        Optional<Integer> sum = list.stream().filter(x -> x % 2 == 0).reduce(Integer::sum);
        System.out.println(sum);

        //Given a list of strings, write a Java program to filter out and print all strings that contain the letter "a" using the Stream API.
        List<String> list2 = List.of("Deep", "Namu", "Simu", "Akash", "shikha");
        list2.stream().filter(x -> x.contains("a")).forEach(System.out::println);
        System.out.println();

        //Write a Java program to generate a list of squares for a given list of integers using the Stream API.
        List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list3.stream().map(x -> x * x).forEach(System.out::println);

        //Given a list of `Person` objects with name and age properties, write a program to sort the list of persons by age in ascending order using the Stream API.

        //Write a Java program to find and print the maximum and minimum values from an array of integers using the Stream API.
        List<Integer> list5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxValue = list5.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Maximum value : "+maxValue);
        int minValue = list5.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Minimum value : "+minValue);

        //Given a list of strings, write a program to count and print the total number of characters in the list using the Stream API.
        List<String> list6 = List.of("Rama","Shyama","Sita","Gita","Radha");
        int sum1 = list6.stream().mapToInt(String::length).sum();
        System.out.println("Total Characters : "+sum1);

        //Write a program to convert all the strings in a list to uppercase and print the result using the Stream API.
        list6.stream().map(x->x.toUpperCase()).forEach(System.out::println);
        //System.out.println();

        //Write a program to check if a list of strings contains any palindromes (words that are the same forwards and backwards) using the Stream API.
        System.out.println("***********Check Palindrome**********");
        List<String> list7 = List.of("madam","nitin","Sita","Gita","Radha");
        List<String> list71=list7.stream().filter(x->x.equalsIgnoreCase(new StringBuilder(x).reverse().toString())).toList();
        System.out.println(list71);


        //**10. Programming Question: Sum of Even Numbers**

        List<Integer> list8=List.of(1,2,3,4,5,6,7,8,9,10);
        list8.stream().filter(x->x%2==0).forEach(System.out::print);
    }
}

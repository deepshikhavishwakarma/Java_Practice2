package CodePractice2.Codeday45_Stream.day1.day5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsWord {
    public static void main(String[] args) {
        //Given a list of strings, write a Java program to filter out and print all strings that contain the letter "a" using the Stream API.
        List<String> list1 = List.of("Deep","sudha","reem","sita","oop");
        list1.stream().filter(x->x.contains("a")).forEach(System.out::println);

        //Write a Java program to generate a list of squares for a given list of integers using the Stream API.
        List<Integer> list2=List.of(1,2,3,4,5,6,7,8,10);
        list2.stream().map(x->x*x).forEach(System.out::println);

        //Given a list of `Person` objects with name and age properties, write a program to sort the list of persons by age in ascending order using the Stream API.

        //Write a Java program to find and print the maximum and minimum values from an array of integers using the Stream API.
        int maxValue = list2.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("Maximum value : "+maxValue);
        int minValue = list2.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Minimum value : "+minValue);

        //Write a program to convert all the strings in a list to uppercase and print the result using the Stream API.
         list1.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println(l);

        //WAP to filter out all even numbers from a list of integers, collect them into a new list, and print the result using the Stream API.

        List<Integer> res = list2.stream().filter(x->x%2==0).toList();
        System.out.println(res);

        //Given two lists of integers, write a program to combine them into a single list and then
        // find and print the sum of all elements in the combined list using the Stream API.
        List<Integer> list3 = List.of(2,3,5,4,3,6,4);
//        List<Integer> result = list3.stream().collect(Collections.addAll(list2),Collectors.counting(),)
     Integer sum =   Stream.concat(list2.stream(),list3.stream()).reduce((a,b)->a+b).get();
        System.out.println(sum);
    }
}

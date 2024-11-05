package CodePractice2.Logic.Arrays.Tasks.String_Task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
* Que-3
___________________
Write a program to print all permutations of String in Java.
Let's say a given string is "abc" so all possible permutations of this string will be "abc", "acb", "bac", "bca", "cab", "cba"
*
* */
public class PermutationString {


    public static void main(String[] args) {

      List<Optional> l1 = new ArrayList<Optional>();
//      l1.add(null);
      l1.add(Optional.of("MyString"));
      l1.add(Optional.of("Java"));
      l1.add(Optional.of("Python"));
      l1.add(Optional.of("Devops"));
      l1.add(Optional.of("Spring"));
      l1.add(Optional.of("Html"));
        for (Optional<String> value:l1 ) {
            if(value.isPresent()){
                System.out.println(value.get().toUpperCase());
            }else{
                System.out.println("Value not found");
            }

        }


    }
}

package CodePractice2.Codeday45_Stream.day1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenNumber {
    public static void main(String[] args) {
        //1st ques
        List<Integer> al = List.of(1,2,3,4,5,6,7,8,9,10);
        al.stream().filter(x->x%2==0).forEach(System.out::println);
        //2nd ques
        Stream<String> names = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
        names.filter(name->name.contains("")).forEach(System.out::print);
        System.out.println();
        //4th ques
        int[] arr = {-3, 2, -5, 6, -1, 4};
        int num= Arrays.stream(arr).filter(x->x>0).map(x->x*x).reduce((a,b)->a+b).getAsInt();
        System.out.println("\nSum is "+num);

        //5th
        Stream<String> str = Stream.of("Toby", "Anna", "Leroy", "Alex");
        str.filter(n->n.length()==4).sorted().limit(2).forEach(System.out::println);
        //7th

        int[] arr1 = {-3, -10, -5, -8};
        if(arr1.length!=0){
            System.out.println("Maximun value : ");
            Arrays.stream(arr1).max().stream().boxed().forEach(System.out::println);

            System.out.println("Minimum value : ");
            Arrays.stream(arr1).min().stream().boxed().forEach(System.out::println);

        }else{
            System.out.println("Array is empty");
        }

        //8th
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list2 = List.of(5, 6, 7, 8);

        list1.addAll(list2);

        int sum = list1.stream().reduce((a,b)->a+b).get();
        System.out.println("Sum of all elements in the combined list: "+sum);



        //9th

        String s1 ="Hello World";

       Map<Character,Long> map=s1.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));

       map.forEach((k,v)->{
           System.out.println(k+" : "+v);
       });

        String testString = "String";
        testString.chars().forEach(ch -> System.out.print((char) ch + " "));   //S t r i n g {chars() use to convert string to intstream of string.}

//        IntStream intStream = testString.codePoints();
//        intStream.forEach(ch -> System.out.print((char) ch + " "));  //S t r i n g


        //10th
        System.out.println();
        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 5, 1, 6, 7, 3);
        Map<Integer,Long> map2 = numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        map2.forEach((k,v)->{

            System.out.println(k+" (Count : "+v+")");
        });

        int[] arr2={5, 7, 8, 1, 6, 3};
//        int[] arr3=Arrays.stream(arr).collect(Collections.reverse(arr2));
        System.out.println(Arrays.stream(arr).average());
//    Arrays.stream(arr).average());


//Expected Output:
//Duplicate elements:
//1 (count: 2)
//2 (count: 2)
//3 (count: 2)
    }
}

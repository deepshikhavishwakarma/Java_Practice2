package CodePractice2.Codeday45_Stream.day1.day6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenSquare {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(1,2,3,4,5,6,7,8,9,10,12,12,13,14,15);
        st.filter(x->x%2==0).map(x->x*x).forEach(System.out::println);


        System.out.println("--------------Concatinate strings of Stream--------------");
        Stream<String> st2 = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
      st2.filter(x -> !x.isEmpty()).forEach(System.out::print);
//        System.out.println(collect);
    }

}

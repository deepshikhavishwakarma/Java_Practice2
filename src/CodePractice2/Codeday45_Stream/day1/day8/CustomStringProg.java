package CodePractice2.Codeday45_Stream.day1.day8;

import java.util.List;
import java.util.stream.Collectors;

public class CustomStringProg {
    public static void main(String[] args) {
       List<String> list = List.of("Sita","Geeta","Rama","Sohan","Divya","Pawni","AbhiShree");
        List<String> collect = list.stream().filter(str -> str.length() >= 5).filter(str -> {
            str = str.toUpperCase();
            if (str.startsWith("A") || str.startsWith("E") || str.startsWith("I") || str.startsWith("O") || str.startsWith("U"))
                return true;
            else return false;
        }).collect(Collectors.toList());

        System.out.println(collect);
    }
}

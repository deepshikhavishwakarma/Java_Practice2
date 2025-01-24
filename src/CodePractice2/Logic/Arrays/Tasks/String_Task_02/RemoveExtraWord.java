package CodePractice2.Logic.Arrays.Tasks.String_Task_02;

import CodePractice2.repeatMethod.Pattern;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class RemoveExtraWord {
    public static void main(String[] args) {
        String s1 = "Reya is is the the best player in eye eye game";
        String[] s = s1.split(" ");
        List<String> collect = Arrays.stream(s).distinct().collect(Collectors.toList());

        String s2 = String.join(" ",collect);
        System.out.println(s2);

    }
}

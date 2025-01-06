package CodePractice2.Codeday50_MergeConcept;

import java.util.function.Predicate;

public class TestMcq2 {
    public static void main(String[] args) {
        Predicate<String> notNull = (arg -> (arg == null));
        System.out.println(notNull.test(null));
    }
}

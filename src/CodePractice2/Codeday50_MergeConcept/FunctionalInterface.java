package CodePractice2.Codeday50_MergeConcept;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String args[]) {
        Function<Integer, Double> div = a -> (double)a / 0;
        System.out.println(div.apply(15));
    }
}


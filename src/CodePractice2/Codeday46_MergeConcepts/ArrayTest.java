package CodePractice2.Codeday46_MergeConcepts;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String args[])
    {
        int array[] = new int [5];
        for (int i = 5; i > 0; i--)
            array[5-i] = i;
        Arrays.fill(array, 1, 4, 8);
        for (int i = 0; i < 5 ; i++)
            System.out.print(array[i]);
    }
}

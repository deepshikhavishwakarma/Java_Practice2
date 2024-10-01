package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task7 {
    public static int[] reverse(int[] arr){
        int temp = arr[0];
        arr[0]=arr[2];
        arr[2]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5};
        System.out.println(Arrays.toString(arr));
        int[] temp = reverse(arr);
        System.out.println(Arrays.toString(temp));
    }

}

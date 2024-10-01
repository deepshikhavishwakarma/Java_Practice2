package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task5 {
    public static int[] check(int[] arr){
        if(arr[0]>arr[arr.length-1]){
            arr[1] = arr[0];
            arr[2] = arr[0];
        }else{
            arr[0] = arr[2];
            arr[1] = arr[2];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {11,2,3};
        System.out.println(Arrays.toString(arr));
        int[] temp = check(arr);
        System.out.println(Arrays.toString(temp));
    }
}

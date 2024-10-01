package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task10 {
    public static int[] newArray(int[] arr){
        int[] arr1 = {arr[0],arr[arr.length-1]};
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] temp = newArray(arr);
        System.out.println(Arrays.toString(temp));
        System.out.println("Length of New Array is :"+temp.length);


    }
}

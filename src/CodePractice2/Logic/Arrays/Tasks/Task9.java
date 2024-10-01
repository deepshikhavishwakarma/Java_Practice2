package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task9 {
    public static int[] middleEle(int[] arr1,int[] arr2){
        int[] arr = {arr1[1],arr2[1]};
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {45,6,9};
        int[] newArr = middleEle(arr1,arr2);
        System.out.println(Arrays.toString(newArr));
    }
}

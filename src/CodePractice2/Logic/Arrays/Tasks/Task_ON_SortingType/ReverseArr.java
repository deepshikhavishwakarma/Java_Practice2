package CodePractice2.Logic.Arrays.Tasks.Task_ON_SortingType;

import java.util.Arrays;

public class ReverseArr {
    public static int[] reverseArray(int[] arr){
//        int[] arr1=new int[arr.length];
        for(int j=0,i=arr.length-1;  j<arr.length/2;i--, j++){
          int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
//        System.out.println(Arrays.toString(arr));
       return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3,4,7,2};
        System.out.println("Array :         "+ Arrays.toString(arr));
        System.out.println("Reverse array : "+ Arrays.toString(reverseArray(arr)));
    }

}

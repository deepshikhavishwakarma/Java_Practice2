package CodePractice2.Logic.Arrays.Tasks.Task_ON_SortingType;

import java.util.Arrays;
/*
* Que-2
______________
Sorting an array means arranging the elements of the array in a certain order. Generally sorting in
an array is done to arrange the elements in increasing or decreasing order.

Problem statement: Given an array of integers arr, the task is to sort the array in ascending order and
return it, without using any built-in functions.

Example:
----------------------------
Input: arr = [5, 2, 4, 3, 1]
Output: [1, 2, 3, 4, 5]


Input: arr = [1, 2, 2, 1, 3, 5, 4]
Output: [1, 1, 2, 2, 3, 4, 5]
*
* */
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

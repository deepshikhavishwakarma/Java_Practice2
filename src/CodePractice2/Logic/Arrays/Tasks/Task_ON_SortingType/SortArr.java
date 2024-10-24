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

* */
//sort in ascending order
public class SortArr {
    public static int[] sortArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,3,4,3,5,6,3,2};
        System.out.println("Unsorted array                       "+Arrays.toString(arr));
        System.out.println("Sorted array                         "+Arrays.toString(sortArr(arr)));

        //Predefined method
        Arrays.sort(arr);
        System.out.println("Sort array using predefined method:  "+Arrays.toString(arr));
    }
}

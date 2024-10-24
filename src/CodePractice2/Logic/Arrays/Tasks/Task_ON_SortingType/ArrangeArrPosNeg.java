package CodePractice2.Logic.Arrays.Tasks.Task_ON_SortingType;
/*Que-4
_______________
Given an unsorted array arr[ ] having both negative and positive integers.
The task is to place all negative elements at the end of the array without changing the
order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

Examples:

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1]

*
* */
import java.util.Arrays;

public class ArrangeArrPosNeg {
    public static void arrangeArr(int[] arr){
        int[] arr1 = new  int[arr.length];
        int index= 0;
      for(int i = 0; i< arr.length;i++){
          if(arr[i]>0){
              arr1[index++]=arr[i];
          }
      }
      for(int i = 0; i< arr.length;i++){
          if(arr[i]<0){
              arr1[index++]=arr[i];
          }
      }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] arr = {-5, 7, -3, -4, 9, 10, -1, 11};
        arrangeArr(arr);

    }
}

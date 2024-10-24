/*
* Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[] = [0, 2, 1, 2, 0]
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 0]
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated into ascending order.
* */

package CodePractice2.Logic.Arrays.Tasks.Task_ON_SortingType;

import java.util.Arrays;

public class ContainingSomeEle {
    public static void checkElements(int[] arr){

        for(int i : arr){
            if((i == 0) || (i==1) || (i == 2)){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
      int[] arr1 = {1,2,0,7,1,2,0,5,6,0};
      int[] arr2 = {2,0,1,0,1,2,0,0};

     ContainingSomeEle.checkElements(arr1);
     System.out.println();
     ContainingSomeEle.checkElements(arr2);
    }
}

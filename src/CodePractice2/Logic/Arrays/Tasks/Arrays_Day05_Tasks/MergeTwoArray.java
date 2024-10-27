package CodePractice2.Logic.Arrays.Tasks.Arrays_Day05_Tasks;

import java.util.*;

/*
* Que-4
_______________
merge two sorted or unsorted arrays into single sorted array without duplicates in Java?

Array A : [7, -5, 3, 8, -4, 11, -19, 21]
Array B : [6, 13, -7, 0, 11, -4, 3, -5]
Sorted Merged Array With No Duplicates :
[-19, -7, -5, -4, 0, 3, 6, 7, 8, 11, 13, 21]
*
* */
public class MergeTwoArray {
    public static int removeDuplicates(int[] arr3) {
//        System.out.println(Arrays.toString(arr3));
        if (arr3.length == 0) {
            return 0;
        }


        // j is the index of the last unique element found
        int j = 0;

        for (int i = 1; i < arr3.length; i++) {
            // If current element is different from the last unique element
            if (arr3[i] != arr3[j]) {
                j++;
                arr3[j] = arr3[i]; // Move the unique element to the next position
            }
        }

        return j + 1; // Return the count of unique elements
    }
    public static void main(String[] args) {
        int[] arr1 = {7, -5, 3, 8, -4, 11, -19, 21};
        System.out.println("Array 1      : "+Arrays.toString(arr1));
        int[] arr2 = {6, 13, -7, 0, 11, -4, 3, -5};
        System.out.println("Array 2      : "+Arrays.toString(arr2));
        int[] arr3  = new int[arr1.length+arr2.length];

        /*
       //Copy array Using arraycopy method
       System.arraycopy(arr1,0,arr3,0,arr1.length);
       System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
       */


        //Copy Array Using for each loop
        int index = 0;
        for(int i : arr1){
            arr3[index++] = i;
        }
        for(int i : arr2) {
            arr3[index++] = i;
        }


        System.out.println("Merged Array : "+Arrays.toString(arr3));

        Arrays.sort(arr3); //Sort array in ascending order.

        System.out.println("Sorted Array : "+Arrays.toString(arr3));

/*

      //Remove duplicate element using Collection(Set)
      LinkedHashSet h1 = new LinkedHashSet();
      for(int i = 0;i< arr3.length;i++){
          h1.add(arr3[i]);
      }
        System.out.println("Using set->");
        System.out.println("Unique Array : "+h1);
*/

//Using Constant extra space
        int n = removeDuplicates(arr3);
        System.out.print("Unique Array : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

   }
}

package CodePractice2.Logic.Arrays.Tasks.Day4TaskArray;

import java.util.Arrays;

/*
* Que-4
_______________
Write a Java program to find continuous sub array whose sum is equal to a given number,
Create one method know as  findSubArray(int[] inputArray, int inputNumber)  ?


Input as :
---------------------
findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);

Output as:
--------------------
Continuous sub array of [42, 15, 12, 8, 6, 32] whose sum is 26 is
12 8 6
Continuous sub array of [12, 5, 31, 13, 21, 8] whose sum is 49 is
5 31 13
Continuous sub array of [15, 51, 7, 81, 5, 11, 25] whose sum is 41 is
5 11 25
*
* */
public class SubArray {
    public static void findSubArray(int[] arr,int num){
        int[] temp = new int[3];
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j = i+1;j< arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                      temp[0] = arr[i];
                      temp[1] = arr[j];
                      temp[2] = arr[k];
                    }
                }

            }
        }
        System.out.println(Arrays.toString(temp));

    }
    public static void main(String[] args) {
        System.out.println("Continuous sub array of [42, 15, 12, 8, 6, 32] whose sum is 26 is");
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
        System.out.println("Continuous sub array of [12, 5, 31, 13, 21, 8] whose sum is 49 is");
        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
        System.out.println("Continuous sub array of [15, 51, 7, 81, 5, 11, 25] whose sum is 41 is");
        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);



    }
}

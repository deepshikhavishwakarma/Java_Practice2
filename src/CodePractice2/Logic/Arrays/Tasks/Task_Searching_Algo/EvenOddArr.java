package CodePractice2.Logic.Arrays.Tasks.Task_Searching_Algo;

import java.util.Arrays;

/*
* Que-2
___________________
Write a java Program to separate even element and odd element form the array and store it in the
new array (means create a new array to store even element and new array to store odd element)

Input as : int arr[]={1,2,3,4,5,6,7,8,9,10}
Output as : evenArr=[2,4,6,8,10]
            oddArr=[1,3,5,7,9]
            *
* */
public class EvenOddArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Main Array : "+Arrays.toString(arr));
        int ecount=0,ocount=0;
        for(int i : arr){
            if(i%2==0){
                ecount++;
            }else{
                ocount++;
            }
        }
        int[] evenArr=new int[ecount];
        int[] oddArr=new int[ocount];
        int eIndex=0,oIndex = 0;
        for (int i:arr) {
            if(i%2==0){
                evenArr[eIndex++]=i;
            }else{
                oddArr[oIndex++]=i;
            }
        }
        System.out.println("Elements Even in Array"+Arrays.toString(evenArr));
        System.out.println("Elements Odd in Array "+Arrays.toString(oddArr));

    }
}

package CodePractice2.Logic.Arrays.Tasks.Task_Searching_Algo;

import java.util.Arrays;
import java.util.Scanner;

/*
* Que-3
___________________
Write a java program to perform the searching operation based on the user choice given element

Input as:{1,2,3,4,5,6};
searchingElement=5;

Output as: The searching element 5 is at the index 4

[Note : Perform the above logic by using binary search algorithm]
* */
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter 10 element in Array. ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element for search . ");
        int element = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0,end = arr.length-1,half = (start+end)/2;
       while(end >=start){
           if(element == half){
               System.out.println("Element present in "+half+" Index");
               break;
           } else if (element>half) {
               start = half+1;

           } else if (element < half) {
               end  = half-1;

           }
           half = (start+end)/2;
       }
       if(end < start){
           System.out.println("Element not present in Array.");
       }

    }
}

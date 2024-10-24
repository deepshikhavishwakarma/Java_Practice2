package CodePractice2.Logic.Arrays.Tasks.Task_Searching_Algo;

import java.util.Arrays;
import java.util.Scanner;

/*
* Que-4
_____________________
Find the nth minimum element from the array as well as nth maximum element from the array

Input 1 : {4,5,1,7,2,13,9};
minEle=3;

Output as : 4 is the searched minimum element

Input 2 : {4,5,1,7,2,13,9};
maxEle=5;

Output as : 4 is the searched maximum element

* */
public class Nth_Min_MaxElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter 10 element in Array. ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element for min value (1-10):. ");
        int min = sc.nextInt();
        System.out.println("Enter Element for max value (1-10): . ");
        int max = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(min+" Min Element : "+arr[min-1]);
        System.out.println(max+" Max Element : "+arr[arr.length-max]);
    }
}

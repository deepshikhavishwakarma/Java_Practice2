package CodePractice2.Logic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store ?");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter numbers for array.");
        for(int i=0;i<arr.length;i++){
//            System.out.println("arr ["+i+"] = "+sc.nextInt());
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.println("arr["+i+"] ="+arr[i]);
        }
        System.out.println(arr.length);
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).count());
//        System.out.println(arr.);
    }
}



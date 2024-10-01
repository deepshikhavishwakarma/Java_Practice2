package CodePractice2.Logic.Arrays.Tasks;

import java.util.Scanner;

public class Task8 {
    public static int sumArr(int[] arr){
        if(arr.length == 0){
            System.out.println("array is having length 0");
        }
        int sum = arr[0]+arr[1];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println("Enter 2 value for array");
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        System.out.println("Sum of elements are "+sumArr(arr));


    }
}

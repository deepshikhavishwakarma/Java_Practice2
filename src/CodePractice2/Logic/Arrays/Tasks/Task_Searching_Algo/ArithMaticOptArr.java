package CodePractice2.Logic.Arrays.Tasks.Task_Searching_Algo;

import java.util.Arrays;

/*
*
* Que-1
_______________
Write a Java program that performs basic arithmetic operations (sum, subtraction, and multiplication) on the elements of an integer array.

Requirements:
___________________
Implement a method calculation(int[] arr) that:
Accepts an integer array as an argument.
Calculates the sum, subtraction (starting from the first element), and multiplication of all elements in the array.
Returns an array with three values: the sum, the result of subtracting all elements, and the result of multiplying all elements.

In the main method:
Call the calculation() method with an array of integers {1, 2, 3, 4}.
Print the result array using Arrays.toString().
Iterate through the result array and print each operation result
(sum, subtraction, multiplication) in a user-friendly format.

Example Output:
[10, -8, 24]
The sum = 10
The sub = -8
The multi = 24
*
* */
public class ArithMaticOptArr {
    public static int[] calculation(int[] arr){
        int sum = arr[0],sub = arr[0],multi = arr[0];

        for(int i =1;i<arr.length;i++){
           sum+=arr[i];
           sub-=arr[i];
           multi *= arr[i];
        }

        return new int[] {sum,sub,multi};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(calculation(arr)));
        System.out.println();
        //2nd method to print array
        int[] temp = calculation(arr);
        System.out.println(Arrays.toString(temp));
        System.out.println("Sum is      : "+temp[0]);
        System.out.println("Sub is      : "+temp[1]);
        System.out.println("Multiply is : "+temp[2]);
    }
}

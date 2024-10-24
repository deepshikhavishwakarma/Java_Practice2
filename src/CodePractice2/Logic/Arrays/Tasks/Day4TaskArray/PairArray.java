package CodePractice2.Logic.Arrays.Tasks.Day4TaskArray;

import java.util.Arrays;

/*
* Que-3
______________
Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
Create one method know as *findThePairs* having the parameter as int arr and int number type ?


Input as :
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);

        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);


Output as:
Pairs of elements whose sum is 10 are :
-10 + 20 = 10
4 + 6 = 10
5 + 5 = 10
Pairs of elements whose sum is 20 are :
-5 + 25 = 20
8 + 12 = 20
9 + 11 = 20
Pairs of elements whose sum is 25 are :
-15 + 40 = 25
10 + 15 = 25
12 + 13 = 25
Pairs of elements whose sum is 50 are :
12 + 38 = 50
23 + 27 = 50
*/
public class PairArray {
    public static void findThePairs(int[] arr,int num){
        for(int i=0;i< arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+(arr[i]+arr[j]));
                }
            }
        }
//        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        System.out.println("Pairs of elements whose sum is 10 are : ");
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        System.out.println("Pairs of elements whose sum is 20 are : ");
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        System.out.println("Pairs of elements whose sum is 25 are : ");
        findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
        System.out.println("Pairs of elements whose sum is 50 are : ");
        findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);

    }
}

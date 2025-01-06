package CodePractice2.Codeday43_Collection.ArrayList_Practice;
/*
* Q1)

Given a list of non-negative integers, return a list of those numbers except
omitting any that end with 9 from a method.


Input as :
nums = [1, 2, 19]
Output as:
[1, 2]

Input as :
nums = [9, 19, 29, 3]
Output as:
[3]


Input as :
nums =[1, 2, 3]
Output as:
[1, 2, 3]

*
* */
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptNine {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) %10!=9){
                System.out.print(arr.get(i)+" ");
            }
        }
//        System.out.println(arr);
    }
}

package CodePractice2.Codeday37_ExceptionHandling;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        System.out.println("--------Division----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number 1");
        int a = sc.nextInt();
        System.out.println("Enter value of number 2");
        int b = sc.nextInt();
        System.out.println("Answer is: "+a/b);
        try{
            System.out.println("Enter value of number 1");
            int a1 = sc.nextInt();
            System.out.println("Enter value of number 2");
            int b2 = sc.nextInt();
            System.out.println("Answer is: "+a1/b2);

        }catch (ArithmeticException e){
            System.out.println("Exception Handled Here ");
        }
    }
}
//wap to demonstrate array index out oof bound exception
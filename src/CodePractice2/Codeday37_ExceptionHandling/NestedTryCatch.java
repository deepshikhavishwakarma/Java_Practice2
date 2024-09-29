package CodePractice2.Codeday37_ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("--------Division----------");


        try( Scanner sc = new Scanner(System.in);){
            System.out.println("Enter value of number 1");
            int a1 = sc.nextInt();
            System.out.println("Enter value of number 2");
            int b2 = sc.nextInt();
            System.out.println("Answer is: "+a1/b2);

            try{
                int[] b = new int[3];
                b[3] = 5;
                System.out.println("Answer " + b[3]);
            }catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("Exception handled In Inner catch.");
            }

        }catch (ArithmeticException e){
            System.out.println("Exception Handled In Outer catch. ");
        }
    }
}

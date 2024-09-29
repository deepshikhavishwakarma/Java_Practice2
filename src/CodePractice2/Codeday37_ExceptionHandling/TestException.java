package CodePractice2.Codeday37_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class CheckException {
    Scanner s=new Scanner(System.in);
    public void div(int num1,int num2){
        try {
            float c = num1 / num2;
            System.out.println("Result is : " + c);
        }catch(ArithmeticException e){
            System.out.println("Divide by 0 Exception occur .\nException handled Successfully.");
        }
    }

    public void convert(){
        System.out.println("Enter something");
        try{
        int s1 = Integer.parseInt(s.next());
        System.out.println(s1);}
        catch (NumberFormatException e){
            System.out.println("Number format exception is handled.");
        }
    }

    public void readInt(){
        System.out.println("Enter something");
        try {
            int s1 = s.nextInt();
            System.out.println(s1);
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception handled.");
        }
    }

    public void convertUpperCase(String s){

        if(s.toUpperCase() instanceof String){
            System.out.println("Converted into Upper case "+s);
        }else{
            throw new NullPointerException();
        }

    }
}
public class TestException{
    public static void main(String[] args) {





        CheckException c1 = new CheckException();
        c1.div(10,0); //Divide by zero
        c1.convert(); //Number format exception
        c1.readInt();//InputMismatchException
        try{
            c1.convertUpperCase(null);//NullPointerException
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception handled.");
        }

    }
}


package CodePractice2.Codeday39_ExceptionHandling.PasswordValidationSystem;

import java.util.Scanner;

public class User {
    private String PasswordValidator;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer b = new StringBuffer("Ayushi");
        StringBuffer c=b; //Ayushi
        c.append(" Madhuri Dixit"); //Ayushi Madhuri Dixit
        System.out.println("b value is"+b);

        System.out.println("c value is"+c);


        String  d = new String("Ayushi");
        String e=d;

        System.out.println(e.concat("  Radhika"));



//        Scanner sc = new Scanner(System.in);
        PasswordValidator p1 = new PasswordValidator();
        System.out.println("Enter a password to validate:");
        String pass  = sc.next();
        try{
            p1.validatePassword(pass);
        }catch(InvalidPasswordException e1){
            System.out.println("Invalid Password");
        }


    }
}

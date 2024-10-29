package CodePractice2.Logic.Arrays.Tasks.String_01;
/*
*  checking how many special characters ,alphabets
 *       numbers are present in the string  ?
 *                   or
 * Check password wheather it is valid or not it must have atleast
 * one upper case character ,one lower case character , one special char
 * and any one digit and length should in between 8 to 15 only?
*
* */
public class PresentStringCheck {
    public static void main(String[] args) {
        String s1 = "Deeghfhjjp@123".trim();

        int spchar = 0,upAlphaChar = 0,digi = 0,lowAlphaChar = 0;
        if(s1.length()>=8 && s1.length()<=15){
         for(int i=0;i<s1.length();i++){
             if (Character.isDigit(s1.charAt(i))){
                 digi++;
             } else if (Character.isLowerCase(s1.charAt(i))) {
                 lowAlphaChar++;
             } else if (Character.isUpperCase(s1.charAt(i))) {
                 upAlphaChar++;
             }else{
                 spchar++;
             }

         }
            System.out.println("Number of digits present in String          : "+digi);
            System.out.println("Number of Upper case char present in String : "+upAlphaChar);
            System.out.println("Number of lower case char present in String : "+lowAlphaChar);
            System.out.println("Number of special char present in String    : "+spchar);
            if(digi >= 1 && lowAlphaChar >=1 && upAlphaChar >=1 && spchar>=1){
                System.out.println("Password is valid.");
            }else{
                System.out.println("Password is not valid.");
            }
        }else{
            System.out.println("Password is not valid.");
        }
    }
}

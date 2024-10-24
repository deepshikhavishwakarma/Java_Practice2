//Write a Java program to check the equality of two arrays?
//without using pre define method?
//
//INPUT AS:
// String[] s1 = {"java", "j2ee", "struts", "hibernate"};
//
// String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
//
// String[] s3 = {"java", "j2ee", "struts", "hibernate"};
//
//CHECK AMOUNG THEN WHICH ARRAY ARE EQUAL
//
//Note: AFTER COMPLETING YOUR LOGIC TRY WITH THE PRE DEFINE METHOD
//      AND CHECK YOUR LOGIC METHOD AND PRE DEFINE METHOD ARE MATCHING OR NOT
//--------------------------------------------------------------------------

package CodePractice2.Logic.Arrays.Tasks.Day4TaskArray;

public class CheckEqualString {
    public static boolean checkString(String[] s1,String[] s2){
        boolean flag = true;
       if(s1.length != s2.length){
           flag = false;
       }
       for(int i= 0;i<s1.length;i++){
           if(!s1[i].equals(s2[i]))
              flag = false;

       }

       return flag;
    }
    public static void main(String[] args) {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        System.out.println("String is Equal : "+checkString(s1,s2));
        System.out.println("String is Equal : "+checkString(s1,s3));


    }
}

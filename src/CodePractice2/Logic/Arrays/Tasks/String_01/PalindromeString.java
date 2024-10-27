package CodePractice2.Logic.Arrays.Tasks.String_01;
/*
Program to check how many pallindromes word present in the paragraph ?
* */


public class PalindromeString {

    public static boolean palindromestr(String string){
      int start = 0;
      int end = string.length()-1;
      while(end>=start){
          if(string.charAt(start)!=string.charAt(end)){
              return false;
          }
          start++;
          end--;
      }
      return true;
    }
    public static void main(String[] args) {
        String s1 = "Hi naman How are you do you know nitin ";
        System.out.println(s1);
        String[] string  = s1.split(" ");
        for (String word :string) {
            if(PalindromeString.palindromestr(word)){
                System.out.println(word +" is Palindrome word.");
            }
        }


    }
}

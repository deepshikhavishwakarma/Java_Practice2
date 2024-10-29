package CodePractice2.Logic.Arrays.Tasks.String_Task_02;

import java.util.Arrays;

/*
* Que-1
__________________
Write the java code to remove the white spaces form the string
without using any pre define method as trim() as well as every starting
letter will be in capital while printing the output?

Input as : " hello everyone we are done with the all the pre define method in string    "
output as"  HelloEveryoneWeAreDoneWithTheAllThePredefineMethodInString
* */
public class RemoveWhiteSp {
    public static void main(String[] args) {
        String s1 = " hello everyone we are done with the all the pre define method in string";
        System.out.println(s1);
        String[] s = s1.split(" ");
        System.out.println("2"+Arrays.toString(s));
        for (String word:s) {
            if(word.length() != 0){
                char[] ch = word.toCharArray();
                String word2="";
            for(int i = 0;i<ch.length;i++){
                if(i==0){
                    ch[i]-=32;
                }
                word2+=ch[i];
            }
             System.out.print(word2);
            }
            else{
                System.out.println(word);


               }
//            System.out.print(word.substring(0,1).toUpperCase());
//            char[] ch = word.toCharArray();
//            for(int i = 0;i<ch.length;i++){
//                if(ch[i].charAt(0))
//            }

        }

//      for(int i = 0;i<s.length;i++){
//          if(!s[i].equals(" ")){
//             String word = s[i];
////              System.out.print(word.toUpperCase());
//
//          }
//      }
//        System.out.println(Arrays.toString(ch));

    }
}


//              char[] ch =s[i].toCharArray();
//             for(int j = 0;j< ch.length;j++)
////                 ch[j] = ch[j].charAt(0)
//              System.out.print(ch[j]);
////              char[] ch = s;
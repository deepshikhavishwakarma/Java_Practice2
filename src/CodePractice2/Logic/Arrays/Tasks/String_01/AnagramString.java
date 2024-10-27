package CodePractice2.Logic.Arrays.Tasks.String_01;

import java.util.Arrays;
// check the string is anagram of or not ?
public class AnagramString {
    public static String sortString(String s){
//        s = s.toLowerCase();
        char[] ch = s.toCharArray();

//        System.out.println(Arrays.toString(ch));
        for(int i = 0; i<ch.length-1; i++){
            for(int j = i+1; j<ch.length; j++){
                if(ch[i]>ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(ch));
        s=new String(ch);
        return s;
    }
    public static void main(String[] args) {
        String s1 = "Listen".toLowerCase();
        String s2 = "Silent".toLowerCase();
        System.out.println(AnagramString.sortString(s1));
        System.out.println(AnagramString.sortString(s2));
        if(s1.length()==s2.length()){
            if(AnagramString.sortString(s1).equals(AnagramString.sortString(s2))){
                System.out.println("Anagram String.");
            }
        } else{
            System.out.println("Not an Anagram String.");
        }

    }
}

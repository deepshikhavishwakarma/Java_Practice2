package CodePractice2.Logic.Arrays.Tasks.Task_Searching_Algo;

public class FindstrVowelCount {
    public static void main(String[] args) {
        String str="codingninjas".toLowerCase();
        int count1=0,count2=0;
        char[] ch=str.toCharArray();
        int half=ch.length/2;
        for(int i=0;i<half;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') count1++;
        }
        for(int j=half;j<ch.length;j++){
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') count2++;
        }
        if(count1==count2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }
}

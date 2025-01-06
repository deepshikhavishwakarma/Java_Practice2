package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FrogProblem {
    public static void main(String[] args) {
//        int []arr={10,20,30,10};
//
//        int len=arr.length;
//
//        int previous1=0;
//        int previous2=0;
//
//      for(int i=1;i<len;i++)
//      {
//          int step1=previous1+Math.abs(arr[i]-arr[i-1]);
//          int step2=(i>1)?previous2+Math.abs(arr[i]-arr[i-2]):Integer.MAX_VALUE;
//          int currentStep=Math.min(step1,step2);
//
//
//          previous2=previous1;
//          previous1=currentStep;
//      }
//        System.out.println(previous1);

       int a=1,b=500,c=2,d=1500;
            int nomi = (a*d)+(b*c);
            int denomi = b*d;
           if(denomi%nomi==0)
           {
               denomi=denomi/nomi;
                nomi=1;
           }
            long[] arr={nomi,denomi};

        System.out.println(Arrays.toString(arr));
    }
}

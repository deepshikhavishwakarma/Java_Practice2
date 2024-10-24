package CodePractice2.Logic.Arrays.Tasks.Day4TaskArray;
/*
* Que-5
_______________
Write a Java program to find all the leaders in an integer array?

Input as:
-------------------
        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});

        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});

        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});

        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});


output as:
-------------------
Output :

The leaders in [12, 9, 7, 14, 8, 6, 3] are :
3
6
8
14

The leaders in [8, 23, 19, 21, 15, 6, 11] are :
11
15
21
23

The leaders in [55, 67, 71, 57, 51, 63, 38] are :
38
63
71

The leaders in [21, 58, 44, 14, 51, 36, 23] are :
23
36
51
58
*
* */
public class LeadersElement {
    public static void findTheLeaders(int[] arr){
        int maxright = arr[arr.length-1];
        System.out.print(maxright+" ");
        for (int i = arr.length-2;i>=0;i--){

         if(arr[i]>maxright){
             maxright = arr[i];
             System.out.print(maxright+" ");
         }
        }
    }
    public static void main(String[] args) {
        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
        System.out.println();
        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
        System.out.println();
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
        System.out.println();
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
    }
}

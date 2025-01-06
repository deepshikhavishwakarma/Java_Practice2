package CodePractice2.Codeday45_Stream.day1.MockPractice;

import java.util.Arrays;

public class Prog1 {
    public static void main(String[] args) {
        int[] arr1 = {-4,6,3,-2,6,-3};
        int[] arr2 = {3,-2,7,8,-9,6,-1};
        int[] merged = new int[arr1.length+arr2.length];
        merged = Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.out.println(Arrays.toString(merged));
        int index1 = 0;
        int index2 = 0;
        int[] arrangedArr1 = {};
        int[] arrangedArr2 = {};
        for(int i = 0;i<arr2.length;i++){
            merged[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(merged));
        for(int i=0;i<merged.length;i++){
            if(merged[i]<0){
                arrangedArr1[index1++] = merged[i];
            }else{
                arrangedArr2[index2++] = merged[i];
            }
        }
        arrangedArr1 = Arrays.copyOf(arrangedArr2,arrangedArr1.length+arrangedArr2.length);
        System.out.println(Arrays.toString(arrangedArr1));
    }
}

package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task11 {
    public static boolean checkArr(int[] arr){
        if(arr[0]==2 || arr[1]==2 ||arr[0]==3 || arr[1]==3){
            return true;
        }
        return false;
    }
    public static boolean checkArr2(int[] arr1){

        for(int i=0;i< arr1.length;i++){
            if(arr1[i]==2 || arr1[i]==3){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] arr1 = {1,23,4,5,6,7,8,9};
        System.out.println(checkArr(arr));
        System.out.println(checkArr(arr1));

    }
}

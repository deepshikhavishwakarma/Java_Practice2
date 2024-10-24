package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task16 {
    public static boolean compareArr(int[] arr1,int[] arr2){
        int flag=0;
        if(arr1.length == arr2.length){

            for(int i=0;i<arr1.length;i++){
                if(arr1[i] == arr2[i]){
                    flag=1;

                }else{
                    flag = 0;
                    break;
                }
            }

//
        }else{
            return false;
        }
        if(flag ==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
int[] arr1 = {1,2,3,4,5,6,7,8,9};
int[] arr2 = {1,2,3,4,5,6,7,8,9};
int[] arr3 = {1,2,3,4,4,6,7,8,9};
        System.out.println("Using Predefined method  "+Arrays.equals(arr1,arr2));
        System.out.println("Using Predefined method  "+Arrays.equals(arr1,arr3));
        System.out.println("Using User define method "+compareArr(arr1,arr2));
        System.out.println("Using User define method "+compareArr(arr1,arr3));

    }
}

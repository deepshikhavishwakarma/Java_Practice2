package CodePractice2.Logic.Arrays.Tasks.Task_ON_SortingType;

import java.util.Arrays;

//sort in ascending order
public class SortArr {
    public static int[] sortArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,3,4,3,5,6,3,2};
        System.out.println("Sorted array"+Arrays.toString(sortArr(arr)));
    }
}

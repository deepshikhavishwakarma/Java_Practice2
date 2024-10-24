package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task13 {
    public static int[] swapArr(int[] arr){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0){
                for(int j=i;j<arr.length-1;j++)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(-4+4);
        int[] arr = {1,0,4,5,9,0,8,9};
        int[] temp = swapArr(arr);

        System.out.println(Arrays.toString(temp));
    }
}

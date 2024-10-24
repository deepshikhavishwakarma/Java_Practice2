package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task12 {
    public static int[] MultiplyArr(int[] arr) {
        int[] newArr=new int[arr.length];

        for(int i=0;i< arr.length;i++){
        newArr[i]=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i] != arr[j]){
                    newArr[i]*=arr[j];

                }
            }
        }
        /*
//        newArr[0]=1;
        for(int i=0;i< arr.length;i++){
            newArr[i]=1;
            for(int j=arr.length-1;j>=0;j--){

                if(arr[i] != arr[j]){
                   // System.out.println("check");
                 newArr[i] *=arr[j];
                }

            }
        }*/
      return newArr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] newArr = MultiplyArr(arr);
        System.out.println(Arrays.toString(newArr));

    }
}

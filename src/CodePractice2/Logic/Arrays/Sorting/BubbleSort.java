package CodePractice2.Logic.Arrays.Sorting;
//Arrays.sort method only can sort array in ascending order
import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr ={31,16,30,5,3,2,10,8};


//        System.out.println("Unsorted array"+Arrays.toString(arr));
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j< arr.length-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
           System.out.println(Arrays.toString(arr)+"\n");

       }

//        System.out.println("Sorted array in ascending Order"+Arrays.toString(arr));


       for(int i=0;i<arr.length;i++){
           int flag = 0;
           for(int j=0;j< arr.length-1-i;j++){
               if(arr[j]<arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = 1;
               }

           }
           if(flag ==0){
               break;
           }

       }

//        System.out.println("Sorted array in descending order"+Arrays.toString(arr));
   long endTime =  System.currentTimeMillis();
   long totTime = endTime-startTime;
        System.out.println(totTime);
    }
}
//drawback TimeComplexity - n-1 round it will go

//add -i in inner for loop for less the line
//add flag for less the round

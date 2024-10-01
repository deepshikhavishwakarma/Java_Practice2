package CodePractice2.Logic.Arrays;
import java.util.*;

public class UsingMethod {
    static Scanner sc = new Scanner(System.in);
    public static void readArr(int[] arr,int size){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
//    readArr(arr,5);
        UsingMethod.printArr(arr);
    }
}

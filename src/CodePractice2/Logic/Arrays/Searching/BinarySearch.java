package CodePractice2.Logic.Arrays.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int searchEle    =  7;
//        System.out.println(Arrays.bi);
        int start =0;

        int end = arr.length-1;
        int midEle = (start +end)/2;
//        for(int i=start)
        while(end>=start){
            if(searchEle == arr[midEle]){
                System.out.println("Search ele Index is "+midEle);
                break;
            } else if (searchEle >arr[midEle]) {
                start = midEle+1;
            }else if (searchEle <arr[midEle]) {
                end = midEle-1;
            }
            midEle = (start +end)/2;

        }
        if(end < start){
            System.out.println("ELement not found. ");
        }
    }
}

package CodePractice2.Logic.Arrays.Tasks.Arrays_Day05_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Que-3
______________
sort array elements by frequency in Java?

Input Array : [7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3]
Sorted Array Elements In Descending Order Of Their Frequency :
[ 1 1 1 1 7 7 7 3 3 4 4 5 9 ]
* */
public class SortFrequecy {
    public static void main(String[] args) {
        int arr[]={7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
        int[] freq = new int[arr.length];
       Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int count = 1,index=0;
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;

                }else{
                    freq[index++]=count;
                    i=j;
                    j++;
                    break;
//
                }

//                freq[index++]=count;

            }
            count =1;
           freq[index++]=count;
        }

    }


}

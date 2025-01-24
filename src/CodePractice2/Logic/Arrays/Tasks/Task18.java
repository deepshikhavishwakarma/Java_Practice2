package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int ind = 0;
//         int[] arr={10,11,12};
//        int[] index = {1,0,2};
        int[] arr={50,40,70,60,90};
        int[] index = {3,0,4,1,2};
//        int[] newArr = new int[arr.length];
//        for (int i=0;i< arr.length;i++){
//            newArr[index[i]] = arr[i] ;
//        }
//        System.out.println("Solved Array"+ Arrays.toString(newArr));
////        Arrays.sort(index);
//        System.out.println("Index : "+Arrays.toString(index));


        for(int i=0;i< arr.length;i++){
            while (index[i]!=i){
                int temp1 = arr[index[i]];
                arr[index[i]] = arr[i];
                arr[i] = temp1;

                int temp2 = index[index[i]];
                index[index[i]] = index[i];
                index[i]=temp2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));
    }
}

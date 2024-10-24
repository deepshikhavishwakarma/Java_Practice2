package CodePractice2.Logic.Arrays.Tasks;
//compare two array lexographically
//if the size of the array and element of the array is matched return 0;
//if the size is same but element is diff then if the 1st array element is > 2nd array element return +ve
//if the size is same but element is diff then if the 1st array element is < 2nd array element return -ve
//

import java.util.Arrays;

public class Task17 {
    public static int compareArr(int[] arr1,int[] arr2){
        if(arr1.length == arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    if(arr1[i]>=arr2[i]){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }

        }
        return arr1.length-arr2.length;
    }
    public static void main(String[] args) {
        int[] arr1 = {11,2,3,4,5,6,7,8};
        int[] arr2 = {19,2,3,4,5,6,7,8};
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(compareArr(arr1,arr2));
    }
}

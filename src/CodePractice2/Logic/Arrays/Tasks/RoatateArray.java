package CodePractice2.Logic.Arrays.Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RoatateArray {
    public static void rotate(int[] nums, int k) {
//        int[] temp = new int[nums.length];
//        int index = 0;
//        for(int i = nums.length-k;i<nums.length;i++){
//            temp[index++] = nums[i];
//        }
//        for(int j = 0 ; j< nums.length-k;j++){
//            temp[index++] = nums[j];
//        }
//        System.out.println(Arrays.toString(temp));

        k%= nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    public static void reverse(int[] nums, int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99}; //7 8 9 10 1 2 3 4 5 6
        int k = 2;
        RoatateArray.rotate(arr,k);

    }
}

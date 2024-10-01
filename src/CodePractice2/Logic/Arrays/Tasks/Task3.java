package CodePractice2.Logic.Arrays.Tasks;

import java.util.Arrays;

//sonarcube tool
public class Task3 {
    public static int[] check(int[] arr){
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
       return arr;
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] temp = check(arr1);
        System.out.println(Arrays.toString(temp));
//        System.out.println(check(arr1));

    }
}

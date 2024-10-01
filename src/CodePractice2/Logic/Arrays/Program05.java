package CodePractice2.Logic.Arrays;

import java.util.Arrays;

public class Program05 {
    public static int[] calculation(int[] arr){
//        int sum=0,sub=0,mul=1;                          //15,-15,120

//        for(int i : arr){
//            sum+=i;                                      //wrong o/p while subtraction
//            sub-=i;
//            mul*=i;
//        }



        int sum=arr[0];
        int sub=arr[0];
        int mul=arr[0];

        //15 -13 120
        for(int i=1 ;i< arr.length;i++){
            sum+=arr[i];
            sub-=arr[i];
            mul*= arr[i];
        }



        int[] result = new int[]{sum,sub,mul};

        System.out.println("Sum is  "+sum);
        System.out.println("sub is  "+sub);
        System.out.println("mul is  "+mul);


        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = calculation(arr);
        System.out.println(Arrays.toString(result));
    }
}

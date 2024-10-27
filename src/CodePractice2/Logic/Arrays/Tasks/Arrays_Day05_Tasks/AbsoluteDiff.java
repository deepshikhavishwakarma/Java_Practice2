package CodePractice2.Logic.Arrays.Tasks.Arrays_Day05_Tasks;
/*
* Que-2
_____________
Write a Java program to find the minimum absolute difference between
any two elements of the given array?

Sorted Input Array : [0, 2, 4, 5, 8, 9]
Minimum Absolute Difference : 1
Pair Of Elements : (4, 5)
==========================
Sorted Input Array : [-89, -62, -57, 12, 31, 45]
Minimum Absolute Difference : 5
Pair Of Elements : (-62, -57)
==========================
Sorted Input Array : [-3, -2, 5, 7]
Minimum Absolute Difference : 1
Pair Of Elements : (-3, -2)
---------------------------------------------------------------------------
* */
public class AbsoluteDiff {
    public static void main(String[] args) {
        int[] arr ={-3, -2, 5, 7};
        int diff=Integer.MAX_VALUE,sub;


        for(int i= arr.length-1;i>0;i--){
            if(arr[i]>0 && arr[i-1]>0){
                sub= arr[i]-arr[i-1];
                diff = Math.min(sub,diff);


            }else if(arr[i]<0){
                sub = -(arr[i-1])-(-arr[i]);
                diff = Math.min(sub,diff);
            }else{
                sub = 0;
                diff = Math.min(sub,diff);
            }

        }
        System.out.println("Minimum Absolute Difference : "+diff);
    }
}

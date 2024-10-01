package CodePractice2.Logic.Arrays.Tasks;

//Given 2 arrays of integers, a and b,return true if they have the same 1st
// element or they have same last element.Both arrays will be length 1 or more

public class Task2 {
    public static boolean check(int[] arr1,int[] arr2){
        if((arr1.length>0 && arr2.length>0)&& ((arr1[0] == arr2[0]) || (arr1[arr1.length-1] == arr2[arr2.length-1]))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,1};
        int[] arr2 = {2,7,4,8,6,7};
        int[] arr3 = {1,2,84,5,6,1};
        int[] arr4 = {1,2,84,5,6,0};
        int[] arr5 = {11,2,84,5,6,1};
        System.out.println(check(arr1,arr2));
        System.out.println(check(arr1,arr3));
        System.out.println(check(arr1,arr4));
        System.out.println(check(arr1,arr4));

    }
}

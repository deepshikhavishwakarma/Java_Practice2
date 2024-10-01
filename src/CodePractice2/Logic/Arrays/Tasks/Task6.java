package CodePractice2.Logic.Arrays.Tasks;

public class Task6 {
    public static boolean check(int[] arr){
        if((arr[0]==15 || arr[arr.length-1]==15) && (arr.length > 0) ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,15};
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {15,2,3,4,5,6,4};
        System.out.println(check(arr));
        System.out.println(check(arr1));
        System.out.println(check(arr2));
    }
}

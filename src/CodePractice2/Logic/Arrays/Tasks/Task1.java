package CodePractice2.Logic.Arrays.Tasks;
//return true if the array length is 1 or more, and the 1st elements both are equal.
public class Task1 {
    public static boolean check(int[] arr){
        if(arr.length>0 && (arr[0] == arr[arr.length-1])){

                return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,1};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(check(arr1));
        System.out.println(check(arr2));

    }
}

package CodePractice2.Logic.Arrays.Tasks;

public class Task4 {
    public static int check(int[] arr){
      if(arr[0]>arr[1] && arr[0]>arr[2]) {
          return arr[0];
      }else if(arr[1]>arr[0] && arr[1]>arr[2]){
          return arr[1];
      }else{
          return arr[2];
      }
    }
    public static void main(String[] args) {
        int[] arr1 ={331,845,25};
        System.out.println(check(arr1)+" is big element");
    }
}

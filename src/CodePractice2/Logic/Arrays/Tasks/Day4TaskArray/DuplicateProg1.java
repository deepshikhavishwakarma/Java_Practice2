
//Que-1
//________________
//Write a Java program to find duplicate elements in an array?
//________________

package CodePractice2.Logic.Arrays.Tasks.Day4TaskArray;

public class DuplicateProg1 {
    public static boolean isDuplicate(int[] arr){
        boolean flag = false;int count=0;
        for(int i=0;i< arr.length-2;i++){
            for(int j=i+1;i< arr.length-1;i++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

        }
        if(count>1){
            return true;
        }
        return flag;
    }
    public static void main(String[] args) {
     int[] arr1 = {1,4,2,41,11,5,6,24,4,3,7};
     int[] arr2 = {11,4,2,14,1,5,6,12,3,7};
        System.out.println("Duplicate value Present in array : "+DuplicateProg1.isDuplicate(arr1));
        System.out.println("Duplicate value Present in array : "+DuplicateProg1.isDuplicate(arr2));
    }
}

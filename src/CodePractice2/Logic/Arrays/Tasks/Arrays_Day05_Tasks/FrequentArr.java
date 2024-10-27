package CodePractice2.Logic.Arrays.Tasks.Arrays_Day05_Tasks;
/*
* Que-1
____________
Write a Java program to find the most frequent element in an array ?

Input Array : [4, 5, 8, 7, 4, 7, 6, 7]
The most frequent element : 7
Its frequency : 3
========================
Input Array : [1, 2, 7, 5, 3, 6]
No frequent element. All elements are unique.
*
* */
public class FrequentArr {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 7, 4, 7, 6, 7};
        int count = 0,max= 0,num=0 ;
        for(int i = 1; i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>max) {
                    max = count;
                     num = arr[i];
                }

            }
        }
        if(num>1) {
            System.out.println("The most frequent element : " + num);
            System.out.println("Its frequency : " + max);
        }else{
            System.out.println("No frequent element. All elements are unique.");
        }
    }
}

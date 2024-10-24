package CodePractice2.Logic.Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,2,6,2,7};
        int num = 4;
        int flag = 0;
        for(int i=0;i< arr.length;i++){
            if(num==arr[i]) {
                System.out.println("Index is "+i);
                flag=1;
//                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found.");
        }
    }
}


//time complexity is very high
//worked on sorted and unsorted array
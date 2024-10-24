package CodePractice2.Logic.Arrays.Tasks.Arrays_Day09_Tasks;
/*
* Que-1>
_________________
 Create the java program by creating the method as Boolean type which will return the
 array element is a neon number of not and print which number is neon and which number is not a neon ?

For example:-
Case 1:
----------------------
Input  : 9
Output : Given number  9 is Neon number

Explanation : square of 9=9*9=81;
              sum of digit of square : 8+1=9(which is equal to given number)

*
* */
public class NeonArray {
    public static boolean isNeon(int ele){
        int sq = ele*ele;
        int sum=0,rem;
        while (sq!=0){
             rem = sq%10;
             sum+=rem;
             sq/=10;
        }
        if(sum == ele)
            return true;
        else
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,11,6};
        for(int i : arr){
            if(isNeon(i)){
                System.out.print(i+" ");
            }
        }

    }
}

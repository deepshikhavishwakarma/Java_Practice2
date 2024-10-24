package CodePractice2.Logic.Arrays.Tasks.Arrays_Day09_Tasks;
/*
* Create the java program by creating the method as Boolean type which will return the
 array element is a smith number of not and print which number is smith and which number is not a smith ?

For example:-
A Smith number is a composite number whose sum of digits equals to the sum of
digits of its prime factors, excluding 1. It is also known as a joke number

Input as: 85

Sum of digits = 8 + 5 = 13

Prime factors of 85 is: 5,17

Sum of digits of its prime factors = 5 + 1+ 7 = 13

Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal.
 Hence, the given number (85) is a smith number.


take the array with the some element like
int [] arr= {1,55,85,999}
Output : you have to print amoung them which are smith number and which are not

*
* */
public class SmithArray {
    public static int sumDigit(int ele){
       int sum=0;
        while (ele!=0){
            sum+=ele%10;
            ele/=10;
        }
        return sum;
    }
    public static int sumofprime(int ele){

        int sum=0;
        for(int i=2;i<=ele;i++){
            if(ele%i==0){
               sum+=sumDigit(i);
               ele/=10;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr = {1,55,85,999};
//        sumofprime(85);
        for (int i : arr) {
            if(sumDigit(i)==sumofprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    }

//Multiplying a number by two and three separately, the number obtained by writing the results
// obtained with the given number will be called a fascinating number. If the result obtained
// after concatenation contains all digits from 1 to 9, exactly once.
//
//In other words, we can also say that a number (n) may be a fascinating number if it
// satisfies the following two conditions:
//
//If the given number is a 3 or more than three-digit
//If the value getting after concatenation contains all digits from 1 to 9, exactly once.
//For example, 192, 1920, 2019, 327, etc.


package CodePractice2.Logic;

import java.util.Scanner;

public class FacinatingNumber {
    public static void main(String[] args) {
        int rem=0,count=0;
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Checking fascinating number");
        int n1 = sc.nextInt();
        int n2 = n1*2;
        int n3 = n1*3;
        String s1 = n1+""+n2+""+n3;

        System.out.println("Print "+s1.contains("0"));
        if(s1.contains("0")){
            System.out.println("Number is not fascinating number.");
        }else{
            if(s1.length()==9){
                int n = Integer.parseInt(s1);
                System.out.println("Answer is "+n);

                while(n!=0){
                    rem = n%10;

                    if(rem == 1){
                        arr[0] = 1;
                    }else if(rem==0){
                        System.out.println("Number is not fascinating number");
                        break;
                    }
                    else{
                        arr[rem-1] = rem;
                    }
                    n = n/10;

                }
                System.out.println("Array length"+arr.length);
//            System.out.println("array length"+arr.length);
                for(int i = 0;i< arr.length;i++){
                    if(arr[i]!=0){
                    System.out.print(arr[i]+" ");
                    count++;
                    }
                }
                System.out.println("arr"+arr[4]+"Count "+count);
                String s2= (count==9) ? "Number is fascinating number" : "Number is not fascinating number";
                System.out.println(s2);
            }else {
                System.out.println("Not fasinating number. ");
            }

        }



    }
}

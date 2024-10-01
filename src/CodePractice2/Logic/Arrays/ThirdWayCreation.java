package CodePractice2.Logic.Arrays;
/*
1st way
int[] arr = new inr[4];

2nd way of createing array

int[] arr = {1,2,3,4,5,6,7};

when you know size,element any size then use this array

adv: less line of code
dis: size is fixed,dynamically we can't take elements

int i1= 102;
float i2= 107.2f;
char c1= 'A';
Student[] arr = new Student("deep",123);
Object[] o1 = {i1,i2,c1,arr};
System.out.println()


3rd way of array creation
dt[] var = new dt[]{ele,ele,ele};

 */

import java.util.Arrays;

public class ThirdWayCreation {
//if we know size,element, type and if we want to send a new arr through method
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
//        Object[] o3 = new Object[]{1,true,"Deep",10.4l,45};
        Object[] o2 = new Object[]{1,true,"Deep",10.5457,45};
        Object[] o1 = new Object[]{1,true,"Deep",10.4f,45};
        System.out.println(o1.length);

        int i=0;
        while(i<o1.length){
            System.out.println(o1[i]);
            i++;
        }

    }
}

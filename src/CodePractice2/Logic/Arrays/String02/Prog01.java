package CodePractice2.Logic.Arrays.String02;
/*
* append() Concat string
* capacity() check capacity of string
*insert() add value at index and element is shifted in this method
* indexOf(str) - find value at index
* replace(n1,n2,str) n1 - included  and n2 -excluded
* isEmpty() - check string is empty or not
* delete(1,5)  ->1 is included and 5 is excluded
* compareTo()
* == compare same only same type   -  if we compare string to stringbuilder we get error
* str1.contentEquals(st2) - we can't compare string to stringbuffer through .equals method so that's why we use contentEquals()
* stringbuffer doesn't create obj in scp area that's why we can't compare it
* setCharAt(1,'r');
* deleteCharAt(4)
*
* all methods are synchronized in StringBuffer
* all methods are non synchronized in StringBuilder

*
*
* * */
public class Prog01 {
    public static void myMethod(){
        System.out.println("Call method in StringDay8");
    }
    public static void main(String[] args) {
        String sb1;
       /* StringBuffer sb  =new StringBuffer("Deep");
        System.out.println(sb.capacity());
        sb.append("abc");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("12345678910122");
        System.out.println(sb);
        System.out.println(sb.capacity());*/
        StringBuffer sb  =new StringBuffer("abc");
        System.out.println(sb.insert(1,"java"));
        System.out.println(sb.replace(1,4,"maya"));
        System.out.println(sb.isEmpty());
        System.out.println(sb.delete(1,5));
        System.out.println(sb.reverse());
//        System.out.println(sb.compareTo("abc"));
//        System.out.println(sb.);

    }
}

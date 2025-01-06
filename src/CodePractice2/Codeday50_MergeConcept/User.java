package CodePractice2.Codeday50_MergeConcept;
class Program {
    public static void m1(int a,int b,int c){
        System.out.println("3 int variable will store");
    }

    public static void m1(int...a){
        System.out.println("var args will store");
    }

//    public static void m1(int [] a){
//        System.out.println("int array will store ");
//    }
}

public class User{
    public static void main(String [] args){
        int [] arr={1,2,3,4};
        Program.m1(arr);

    }
}
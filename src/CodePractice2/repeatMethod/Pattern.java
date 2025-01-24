package CodePractice2.repeatMethod;

public class Pattern {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            System.out.println((" ").repeat(3)+("*").repeat(i));
        }

        for(int i=1;i<=n;i++){
            System.out.println((" ").repeat(n-i)+("*").repeat(i));
        }
        for(int i=1;i<=3;i++){
            System.out.println((" ").repeat(3-i)+("*").repeat(2*i-1)+(" ").repeat(3-i));
        }


    }
}

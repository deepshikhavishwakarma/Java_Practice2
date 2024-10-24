package CodePractice2.Logic.Arrays.Tasks;

public class Task14 {
    public static  void m1(int a){
        if(a<0){
            return ;
        }
        System.out.println(a+1);//6 5 4 3 2 1
        m1(a-1);//0
        System.out.println(a+1);
    }
    public static void main(String[] args) {
       m1(7);
    }
}

package CodePractice2.Codeday32_InnerClass;

class A{
    private String name;
    private String email;



    static class B{
        A a1 = new A();
       public void m1(){
           System.out.println(a1.name);
       }

    }


}


public class TestCase1 {
    public static void main(String[] args) {

    }
}

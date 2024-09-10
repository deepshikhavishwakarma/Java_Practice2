package CodePractice2.Codeday32_InnerClass;

class A1{
    private String name;
    private String email;

    public A1(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void m1(){
        System.out.println(name);
        System.out.println(email);
    }


    static class B1{

        public void m1(){
            System.out.println("My name is ");
        }

    }


}



public class TestCase2 {
    public static void main(String[] args) {
        A1.B1 b = new A1.B1();
        b.m1();
        A1 a1 = new A1("Deep","deep@gmail.com");
        a1.m1();

    }
}

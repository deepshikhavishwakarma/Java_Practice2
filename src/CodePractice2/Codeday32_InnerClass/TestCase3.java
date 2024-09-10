package CodePractice2.Codeday32_InnerClass;

class A3{
    public String name;
    private String email;
    static int x = 10;

    public A3(String name, String email) {
        this.name = name;
        this.email = email;
    }
    static class B3
    {
         int z=90;
        public void m1(){
            System.out.println("My name is "+x+" "+z);
        }

    }
    public void m1(){

//        A3.B3 b3 = new A3.B3();
//        b3.m1();
        System.out.println(name);
        System.out.println(email);
    }




}



public class TestCase3 {
    public static void main(String[] args) {
        A3.B3 b = new A3.B3();
        b.m1();
        A3 a1 = new A3("Deep","deep@gmail.com");
        a1.m1();
        //System.out.println(b.x);

    }
}


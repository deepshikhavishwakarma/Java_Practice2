package CodePractice2.Codeday47_MethodOverloading_Overriding;

class A4
{}

class B4 extends A4
{}

class C4 extends B4
{}

public class MainClass
{
    static void overloadedMethod(A4 a)
    {
        System.out.println("ONE");
    }

    static void overloadedMethod(B4 b)
    {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }

    public static void main(String[] args)
    {
        C4 c = new C4();

        overloadedMethod(c);
    }
}
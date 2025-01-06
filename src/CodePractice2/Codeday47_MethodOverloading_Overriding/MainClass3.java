package CodePractice2.Codeday47_MethodOverloading_Overriding;

class X6
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Y6 extends X6
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Z6 extends Y6
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}
public class MainClass3
{
    public static void main(String[] args)
    {
        X6 x = new Y6();

        x.calculate(10, 20);

        Y6 y = (Y6) x;

        y.calculate(50, 100);

        Z6 z = (Z6) y;

        z.calculate(100, 200);
    }
}

package CodePractice2.Codeday34_Polymorphism.MCQ_Solution;

class X3
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Y3 extends X3
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Z3 extends Y3
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
        X3 x = new Y3();

        x.calculate(10, 20);

        Y3 y = (Y3) x;

        y.calculate(50, 100);

        Z3 z = (Z3) y;

        z.calculate(100, 200);
    }
}

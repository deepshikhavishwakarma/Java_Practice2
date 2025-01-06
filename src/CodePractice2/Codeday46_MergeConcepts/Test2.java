package CodePractice2.Codeday46_MergeConcepts;

interface A
{
    public void innerMeth();
}
public class Test2
{
    A a;
    int memVar = 1;
    void aMethod()
    {
        a = new A()
        {
            public void innerMeth()
            {
                System.out.println(memVar);
            }
        };
    }
    public static void main(String[] args)
    {
        Test2 t = new Test2();
        t.aMethod();
        t.a.innerMeth();


    }
}

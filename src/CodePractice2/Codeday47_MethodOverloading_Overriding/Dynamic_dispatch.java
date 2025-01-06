package CodePractice2.Codeday47_MethodOverloading_Overriding;

class A1
{
    int i;//1
    public void display()
    {
        System.out.println(i);
    }
}
class B1 extends A1
{
    int j;//2
    public void display()
    {
        System.out.println(j);
    }
}
class Dynamic_dispatch
{
    public static void main(String args[])
    {
        B1 obj2 = new B1();
        obj2.i = 1;
        obj2.j = 2;
        A1 r;
        r = obj2;
        r.display();
    }
}
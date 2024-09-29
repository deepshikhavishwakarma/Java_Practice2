package CodePractice2.Codeday34_Polymorphism.MCQ_Solution;

class A3
{
    int i; //1
    public void display()
    {
        System.out.println(i);
    }
}
class B3 extends A3
{
    int j;  //2
    public void display()
    {
        System.out.println(j);
    }
}
class Dynamic_dispatch
{
    public static void main(String args[])
    {
        B3 obj2 = new B3();
        obj2.i = 1;
        obj2.j = 2;
        A3 r;
        r = obj2;
        r.display();
    }
}
package CodePractice2.Codeday34_Polymorphism.MCQ_Solution;

 final class A1
{
    int i;
}
class B2
{
    int j;
    public void disp() {
        System.out.println(j);
    }
}
class inheritance
{
    public static void main(String args[])
    {
        B2 obj = new B2();
        obj.disp();
    }
}

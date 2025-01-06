package CodePractice2.Codeday47_MethodOverloading_Overriding;

class ParentClass{
    {
        System.out.println("parent class non static block");
    }
    ParentClass(){
        System.out.println("parent class constructor");
    }
    public static void m1() {
        System.out.println("Parent class static method");
    }
    public void m2() {
        System.out.println("Parent class non static method");
    }
}

class ChildClass extends ParentClass{
    {
        System.out.println("child class non static block");
    }
    ChildClass(){
        System.out.println("child class constructor");
    }
    public static void m1() {
        System.out.println("child class static method");
    }
    @Override
     public void m2() {
        System.out.println("child class non static method ");
    }
}
public class Program01 {

    public static void main(String[] args) {
        ParentClass obj=new ChildClass();

    }
}
package CodePractice2.Codeday47_MethodOverloading_Overriding;

class A3{
    public void printValue(){
        System.out.println("Value-A");
    }
}
class B3 extends A3{
    public void printNameB(){
        System.out.println("Name-B");
    }
}
class C extends A3{
    public void printNameC(){
        System.out.println("Name-C");
    }
}
public class Test2{
    public static void main (String[] args){
        B3 b = new B3();
        C c = new C();
        newPrint(b);
        newPrint(c);
    }
    public static void newPrint(A3 a){
        a.printValue();
    }
}
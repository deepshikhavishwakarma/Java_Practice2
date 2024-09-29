package CodePractice2.Codeday39_ExceptionHandling;

public class Example1 {
    void show(int a) throws MyException
    {
        System.out.println("Hello Custom Exception");
        int b = a/0;
    }
    public static void main(String[] args)
    {
        Example1 obj = new Example1();
      //  obj.show(5);
        System.out.println("Bye Custom Exception");
    }
}

class MyException extends Exception
{
    MyException(){ super();}
    MyException(String name){ super(name); }
}
package CodePractice2.Codeday34_Polymorphism.MCQ_Solution;

class Parent {
    void showMessage()
    {
        System.out.println("Parent method is called");
    }
}

class Child extends Parent {
    @Override
    void showMessage()
    {
        System.out.println("Child method is called");
    }
}

public class DownCasting{

    public static void main(String[] args)
    {
        Parent p = new Child();

        Child c = (Child)p;
        c.showMessage();
    }
}
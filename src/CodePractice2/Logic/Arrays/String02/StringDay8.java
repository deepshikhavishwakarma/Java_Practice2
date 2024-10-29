package CodePractice2.Logic.Arrays.String02;
/*
*
* forName is a static name
* ! - >How can we call class without using object creation or class name
*  Class.forName() -- gives fully qualified name  ,it is used to load class at run time we don't need to create any object
* Class.forName("");which take parameter as a string that called fully qualified name
*
* Singleton class
*
*
*
* */
public class StringDay8 {
    public static void main(String[] args) {
//        Prog01.myMethod();

        try {
            Class.forName("CodePractice2.Logic.Arrays.Tasks.String_01");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

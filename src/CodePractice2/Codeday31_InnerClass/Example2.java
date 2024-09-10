package CodePractice2.Codeday31_InnerClass;

public class Example2 {
    int x=10;

      static class AsStatic {

          static void m1() {

             //A a1 = new A();
             Example2 e1 = new Example2();
             System.out.println("Static   "+(e1.x+1));

             Example2 e2 = new Example2();
             System.out.println("Static   "+(e2.x));

         }
     }

    class NonStatic {

        static void m1() {

            //A a1 = new A();
            Example2 e1 = new Example2();
            System.out.println("Non Static   "+(e1.x+10));

            Example2 e2 = new Example2();
            System.out.println("Non Static   "+(e2.x-12));

        }
    }


    public static void main(String[] args) {
         Example2.AsStatic ob=new Example2.AsStatic();//If we create inner class as static
        ob.m1();
        Example2.NonStatic ob1=new Example2().new NonStatic();//If we create Inner class as instance class.
        ob1.m1();
    }
}

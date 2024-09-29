package CodePractice2.Codeday36_WrapperClass;


 class Testol {
     public void m1(Integer i) {
         System.out.println("Integer");
     }
     public void m1(Long l) {
         System.out.println("Long");
     }
     public void m1(Object... obj) {
         System.out.println("Object...");
     }
     public static void main(String[] args) {
         Testol t = new Testol();
         char ch = 'A';
         t.m1(ch);

     }
}
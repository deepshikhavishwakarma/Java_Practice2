package CodePractice2.Codeday37_ExceptionHandling;

public class OutBound {
    public static void main(String[] args) {
//        int a = Integer.parseInt(args[8]);
//        System.out.println(a);
       try {
           int[] b = new int[3];
           b[3] = 5;
           System.out.println("Answer " + b[3]);
       }catch(ArrayIndexOutOfBoundsException ae){
           System.out.println("Exception handled.");
        }
    }
}

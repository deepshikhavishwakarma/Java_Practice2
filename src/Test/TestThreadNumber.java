package Test;


class NumberPrinter extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=1;i<=100;i++)
        {
            if(i%2==0){
                printPrime();
            }else{
                printEven();
            }

        }



    }

    public void printPrime(){

        int count=0,n=0;
        for(int num=1;num<=100;num++){
            for(int i=1;i<=num;i++){

                if(num % i==0){
                    count++;
                    n=i;
                }
            }
            if(count==2) {
                System.out.println("Prime: "+n);
            }
            count = 0;
        }
    }
    public void printEven(){
        currentThread();
        for(int num=1;num<100;num++){
            if(num%2==0){
                System.out.println("Even: "+num);
            }
        }

    }
}
public class TestThreadNumber {
    public static void main(String[] args) {
        NumberPrinter n1 = new NumberPrinter();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);

//        n1.printEven();
        t1.start();
//        n1.printPrime();
        t2.start();
    }
}

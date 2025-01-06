package CodePractice2.Codeday49_MergeConcept.InterThreadCommunication;

public class MultiThreadEnv extends Thread{

    int availavle =0;


    public synchronized void produce(int items) throws InterruptedException {
        if(availavle>0){
            wait();
        }
        for(int i=1;i<=items;i++){
            availavle++;
            notify();
            wait();
            Thread.sleep(500);
            System.out.println("The producer had produced the items as "+i);

        }
        System.out.println("available product :"+availavle);
        notify();



    }
    public synchronized void consume(int items) throws InterruptedException {

        if(availavle==0){
            wait();
        }

        for(int i=1;i<=items;i++){
            availavle--;
            notify();
            wait();
            System.out.println("The consume had produced the items as "+i);

        }
notify();

    }
    public static void main(String[] args) {
     MultiThreadEnv mt = new MultiThreadEnv();
     Thread t1 = new Thread(){
         @Override
         public void run() {
             try {
                 mt.produce(10);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    mt.consume(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
     t1.start();
     t2.start();

    }
}

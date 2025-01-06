package CodePractice2.Codeday51_MultiTasking;

class Resource{
    private boolean isReady=false;

    public synchronized void process(){

            try {
                if(!isReady) {
                    System.out.println(Thread.currentThread().getName() + " is Waiting ...");
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+" is Processing...");
                isReady=false;
                notify();
                System.out.println(Thread.currentThread().getName()+" notified another...");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread intrupted "+e.getMessage());
            }
        }

     public synchronized void trigger(){
        isReady=true;
        notify();
         System.out.println(Thread.currentThread().getName()+" trigger and notify...");
    }

}

public class TestThreadWaitNotify {
    public static void main(String[] args) {
        Resource rs = new Resource();
        Thread t1 = new Thread(()->rs.process(),"Thread-1");
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(500);
                rs.trigger();
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
        },"Thread-2");

      t1.start();
      t2.start();

    }
}

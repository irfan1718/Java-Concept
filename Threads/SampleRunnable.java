package Threads;

public class SampleRunnable {
   public static void main(String[] args) {
    ThreadRunnable tr=new ThreadRunnable(1);
    ThreadRunnable tr1=new ThreadRunnable(2);
    ThreadRunnable tr2=new ThreadRunnable(3);
    Thread t=new Thread(tr);
    Thread t1=new Thread(tr1);
    Thread t2=new Thread(tr2);
    t.start();
    t1.start();
    t2.start();
   }
}

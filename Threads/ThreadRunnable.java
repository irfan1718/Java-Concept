package Threads;

public class ThreadRunnable implements Runnable {
    int a;

    ThreadRunnable(int a){
        this.a=a;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<10;i++){
            System.out.println("Count "+i+" Thread "+a+"\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}

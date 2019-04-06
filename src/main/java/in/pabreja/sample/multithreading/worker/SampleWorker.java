package in.pabreja.sample.multithreading.worker;

import java.util.concurrent.CountDownLatch;

// A class to represent threads for which
// the main thread waits.
public class SampleWorker extends Thread {

    private int delay;
    private CountDownLatch downLatch;

    public SampleWorker(int delay, CountDownLatch downLatch, String name){
        super(name);
        this.delay = delay;
        this.downLatch = downLatch;
    }


    public void run(){
        try{
            Thread.sleep(delay);
            downLatch.countDown();
            System.out.println(currentThread().getName()+" finished");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

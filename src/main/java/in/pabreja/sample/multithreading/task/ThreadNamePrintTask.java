package in.pabreja.sample.multithreading.task;


/**
 *
 *
 *
 * Based on the requirement we can make a thread to be in sleeping state for a specified period of time
 *
 * sleep(): causes the thread to definitely stop executing for a given amount of time; if no other thread or process needs to be run, the CPU will be idle (and probably enter a power saving mode).
 */
public class ThreadNamePrintTask implements Runnable {
    @Override
    public void run() {
        for(int i = 0 ; i < 4 ; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e ){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

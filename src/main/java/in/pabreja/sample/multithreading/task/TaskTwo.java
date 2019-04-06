package in.pabreja.sample.multithreading.task;

public class TaskTwo implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing task two.");
            try{
                Thread.sleep(1000);
            } catch (Throwable e){
                    e.printStackTrace();
            }
        }
    }
}

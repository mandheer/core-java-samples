package in.pabreja.sample.multithreading.task;

public class TaskOne implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Executing task one.");
            try{
                Thread.sleep(1000);
            } catch (Throwable e){

                    e.printStackTrace();
            }
        }
    }
}

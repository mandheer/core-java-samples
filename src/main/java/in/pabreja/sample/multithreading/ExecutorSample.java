package in.pabreja.sample.multithreading;

import in.pabreja.sample.multithreading.task.TaskOne;
import in.pabreja.sample.multithreading.task.TaskTwo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSample {

    private static ExecutorService executorService;
    private static volatile Future taskOneResults;
    private static volatile Future taskTwoResults;

    public static void main(String[] args) {
        executorService = Executors.newFixedThreadPool(2);
        while(true){
            try{
                checkTasks();
                Thread.sleep(5000);
            } catch (Exception e){
                System.err.println("Caught exception : "+e.getMessage());
            }
        }
    }
    private static void checkTasks() throws Exception {
        if(taskOneResults ==null ||
            taskOneResults.isDone() ||
            taskOneResults.isCancelled()){
            taskOneResults = executorService.submit(new TaskOne());
        }

        if(taskTwoResults ==null ||
                taskTwoResults.isDone() ||
                taskTwoResults.isCancelled()){
            taskTwoResults = executorService.submit(new TaskTwo());
        }
    }

}

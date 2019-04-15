package in.pabreja.sample.multithreading;

import in.pabreja.sample.multithreading.task.ThreadNamePrintTask;

public class SleepDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadNamePrintTask());
        // calls run method
        t.start();
        Thread t2 = new Thread(new ThreadNamePrintTask());
        //calls run method
        t2.start();
    }
}

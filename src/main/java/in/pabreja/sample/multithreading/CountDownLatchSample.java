package in.pabreja.sample.multithreading;

import in.pabreja.sample.multithreading.worker.SampleWorker;

import java.util.concurrent.CountDownLatch;

// Java Program to demonstrate how
// to use CountDownLatch, Its used
// when a thread needs to wait for other
// threads before starting its work.
public class CountDownLatchSample {
    public static void main(String[] args) throws InterruptedException {
        // Let us create task that is going to
        // wait for four threads before it starts
        CountDownLatch latch = new CountDownLatch(4);

        SampleWorker first = new SampleWorker(1000, latch, "WORKER-1");
        SampleWorker two = new SampleWorker(1000, latch, "WORKER-2");
        SampleWorker three = new SampleWorker(1000, latch, "WORKER-3");
        SampleWorker four = new SampleWorker(1000, latch, "WORKER-4");

        // The main task waits for four threads
        latch.await();

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }

}

package in.pabreja.sample.multithreading;

import in.pabreja.sample.multithreading.task.TaskOne;
import in.pabreja.sample.multithreading.task.ThreadNamePrintTask;

/**
 * yield(): Suppose there are three threads t1, t2, and t3. Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state. Completion time for thread t1 is 5 hour and completion time for t2 is 5 minutes. Since t1 will complete its execution after 5 hours, t2 has to wait for 5 hours to just finish 5 minutes job. In such scenarios where one thread is taking too much time to complete its execution, we need a way to prevent execution of a thread in between if something important is pending. yeild() helps us in doing so.
 * yield() basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.
 *
 *
 * Use of yield method:
 *
 * Whenever a thread calls java.lang.Thread.yield method, it gives hint to the thread scheduler that it is ready to pause its execution. Thread scheduler is free to ignore this hint.
 * If any thread executes yield method ,
 * thread scheduler checks if there is any thread with same or high priority than this thread.
 * If processor finds any thread with higher or same priority then it will move
 * the current thread to Ready/Runnable state and give processor to other thread
 * and if not – current thread will keep executing.
 *
 * syntax : public static native void yield()
 */
public class YieldDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {for (int i = 0; i < 5 ; i++)
            System.out.println(Thread.currentThread().getName()+" in control.");
        },
                "Thread Name Print Task");
        t.start();

        for (int i = 0; i<5; i++){
            //control passes to child thread
            Thread.yield();

            //After execution of child thread
            //main thread takes over
            System.out.println(Thread.currentThread().getName()+" in control");
        }

    }
}

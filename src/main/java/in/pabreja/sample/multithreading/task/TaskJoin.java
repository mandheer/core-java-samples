package in.pabreja.sample.multithreading.task;

/**
 * join(): The join() method of a Thread instance is used to join the start of a thread’s execution
 * to end of other thread’s execution such that a thread does not start running until another thread ends.
 * If join() is called on a Thread instance, the currently running thread will block until the
 * Thread instance has finished executing.
 *
 * The join() method waits at most this much milliseconds for this thread to die.
 * A timeout of 0 means to wait forever
 *
 * Note :
 * > If any executing thread t1 calls join() on t2 i.e; t2.join()
 * immediately t1 will enter into waiting state until t2 completes its execution.
 * > Giving a timeout within join(), will make the join() effect to be nullified after the specific timeout.
 *
 * Syntax :
 * // waits for this thread to die.
 * public final void join() throws InterruptedException
 *
 * // waits at most this much milliseconds for this thread to die
 * public final void join(long millis)
 *               throws InterruptedException
 *
 * // waits at most milliseconds plus nanoseconds for this thread to die.
 * The java.lang.Thread.join(long millis, int nanos)
 */
public class TaskJoin implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        // prints the name if the current thread
        System.out.println("Current Thread : "+ t.getName());
        //checks if the current thread is alive
        System.out.println("Is Alive ? "+t.isAlive());
    }
}

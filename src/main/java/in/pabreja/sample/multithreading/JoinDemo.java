package in.pabreja.sample.multithreading;

import in.pabreja.sample.multithreading.task.TaskJoin;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new TaskJoin());
        t.start();

        //waits for 1000 ms for this thread to die
        t.join(1000l);

        System.out.println("Joining after 1000ms ");
        System.out.println("Current thread : "+ t.getName());
        //check the is Alive condition
        System.out.println("Is Alive ? "+t.isAlive());

    }
}

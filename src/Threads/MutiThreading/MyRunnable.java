package Threads.MutiThreading;

public class MyRunnable implements Runnable {

    // Runnable is an interface
    //So we need to implement the run method in order to use it.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread #2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread #2 is Done!");
    }
}

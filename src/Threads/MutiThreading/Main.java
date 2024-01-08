package Threads.MutiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Create a thread by extending the Thread class. 1st way. (not recommended)
        MyThread thread1 = new MyThread();


        // Create a thread by implementing the Runnable interface. 2nd way. (recommended)
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        MyThread3 thread3 = new MyThread3();

        thread1.start();
        thread1.join();
        thread2.start();
//        thread3.start();
    }
}

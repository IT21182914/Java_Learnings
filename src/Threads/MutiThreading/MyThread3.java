package Threads.MutiThreading;

public class MyThread3 extends Thread {


    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println("Thread #3: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread #3 is Done!");
    }
}

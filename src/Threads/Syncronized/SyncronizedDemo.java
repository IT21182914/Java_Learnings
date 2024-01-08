package Threads.Syncronized;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class SyncronizedDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {


            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join(); // wait for thread1 to finish. otherwise, the count will be 0.


        System.out.println(counter.count);

    }
}

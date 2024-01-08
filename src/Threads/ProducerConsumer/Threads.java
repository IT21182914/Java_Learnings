package Threads.ProducerConsumer;

class Q {
    private int num;

    public void put(int num) {
        System.out.println("Put : " + num);
        this.num = num;
    }

    public int get() {
        return num;
    }
}

class Producer implements Runnable {
    private Q q;

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Get : " + q.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

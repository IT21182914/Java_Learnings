package Threads;

public class Main {

    public static void main(String[] args) {


//        System.out.println(Thread.activeCount());

//        Thread.currentThread().setName("MAIN THREAD");
//        System.out.println(Thread.currentThread().getName());


//        System.out.println(Thread.currentThread().getPriority());
//
//        System.out.println(Thread.currentThread().isAlive());


//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Main thread interrupted");
//            }
//        }
//        System.out.println("Main thread exiting.");


        MyThread thread = new MyThread();

        thread.start();

        System.out.println(thread.isAlive());
        thread.setName("2nd Thread");
        System.out.println(thread.getName());


    }
}

public class Demo {
    public static void main(String[] args) {

        MyRunnable.mt = Thread.currentThread();
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        // # main thread body
        for (int i = 0; i < 10; ++i) {
            System.out.println("Main Thread: " + Thread.currentThread());
        }

    }
}

class MyRunnable implements Runnable {
    static Thread mt;

    @Override
    public void run() {
        // # yield for main thread to complete
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // # task body
        for (int i = 0; i < 10; ++i) {
            System.out.println("Child Thread: " + Thread.currentThread());
        }
    }
}
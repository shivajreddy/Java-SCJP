public class Demo {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable.mt = Thread.currentThread();

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        // t.interrupt();

        Thread.currentThread().interrupt();

        // # job of main thread
        for (int i = 0; i < 10; ++i) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread() + " : " + i);
        }
    }
}

class MyRunnable implements Runnable {
    static Thread mt;

    @Override
    public void run() {

        // # job of child method
        for (int i = 0; i < 10; ++i) {
            System.out.println(Thread.currentThread() + " : " + i);
        }

        System.out.println("entering sleeping state");

        try {
            Thread.sleep(2000);
            System.out.println("finished waiting");
        } catch (InterruptedException e) {
            System.out.println("IE: " + e);
        }

    }
}
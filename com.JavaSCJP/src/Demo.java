public class Demo {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable.mt = Thread.currentThread();

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); //# r is the target, where r is Runnable(MyRunnable extends Runnable)type
        t.start();

        // # Job of main thread
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Main Thread : " + Thread.currentThread().getName());
        }
    }
}

class MyRunnable implements Runnable {

    static Thread mt;

    public void run() {
        // # Job of Runnable item
        for (int i = 0; i < 10; ++i) {
            try {
                mt.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " MyRunnable : " + Thread.currentThread().getName());
        }
    }
}

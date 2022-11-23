public class Demo {

    public static void main(String[] args) throws InterruptedException {

        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r); // r is the target, where r is Runnable(MyRunnable extends Runnable)type
        t.start();

        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Main Thread: " + Thread.currentThread().getName());
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() { // job of the Runnable item
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " MyRunnable : " + Thread.currentThread().getName());
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Child Thread: " + Thread.currentThread().getName());
        }
    }
}

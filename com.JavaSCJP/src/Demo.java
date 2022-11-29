public class Demo {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();

        System.out.println(t.count); // dangerous

        synchronized (t) {
            System.out.println("main thread calling wait()");
            t.wait();
            System.out.println("main thread got the notification");
        }

        System.out.println(t.count);

    }
}

class MyThread extends Thread {

    long count = 0;

    public void run() {
        synchronized (this) {
            for (long i = 0; i < 999999999L; i++) {
                count += i;
            }
            System.out.println("child thread sending notification");
            this.notify();
        }
    }
}

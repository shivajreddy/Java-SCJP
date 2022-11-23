public class Demo {

    public static void main(String[] args) throws InterruptedException {

        // set low priority for main thread
        Thread mainThread = Thread.currentThread();
        mainThread.setPriority(1);

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); // r is the target, where r is Runnable(MyRunnable extends Runnable)type
        t.start();
        t.setPriority(10);

        // System.out.println("main prior = " + Thread.currentThread().getPriority());
        // System.out.println("my thread prior = " + t.getPriority());

        // # Job of main thread
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Main Thread: " + Thread.currentThread().getName());
        }

    }

    static void m() {
        System.out.println(Thread.currentThread());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println();
        // # Job of Runnable item
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " MyRunnable : " + Thread.currentThread().getName());
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("executing MyThread2 job");
        // for (int i = 0; i < 10; ++i) {
        //     System.out.println(i + " Child Thread: " + Thread.currentThread().getName());
        // }
    }
}

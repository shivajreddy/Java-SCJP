public class Demo {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(1);

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); //# r is the target, where r is Runnable(MyRunnable extends Runnable)type
        t.setPriority(10);
        t.start();

        // # Job of main thread
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Main Thread: " + Thread.currentThread().getName());
        }
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


public class Demo {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Main Thread: " + Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " Child Thread: " + Thread.currentThread().getName());
        }
    }
}

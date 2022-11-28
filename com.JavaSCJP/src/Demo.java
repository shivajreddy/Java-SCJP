public class Demo {

    public static void main(String[] args) {

        Display d1 = new Display();

        MyThread t1 = new MyThread(d1, "dhoni");
        MyThread t2 = new MyThread(d1, "yuva");
        t1.start();
        t2.start();
    }
}

class Display {

    public synchronized void wish(String name) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + " : " +  name + " : " + Thread.currentThread());
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

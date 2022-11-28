public class Demo {
    public static void main(String[] args) {

        Display d = new Display();

        DisplayJob1 job1 = new DisplayJob1(d);
        DisplayJob2 job2 = new DisplayJob2(d);

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);

        t1.start();
        t2.start();

    }
}

class Display {
    public synchronized void displayN() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void displayC() {
        for (int i = 65; i < 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    // synchronized(Display.class)
    // {
    // }

}

class DisplayJob1 implements Runnable {
    Display d;

    public DisplayJob1(Display d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.displayN();
    }
}

class DisplayJob2 implements Runnable {
    Display d;

    public DisplayJob2(Display d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.displayC();
    }
}

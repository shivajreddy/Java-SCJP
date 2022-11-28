public class Demo {

    public void action() throws InterruptedException {
        Message m = new Message();
        synchronized (this) {
            m.wait();
            m.notify();
            m.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo();
        d.action();
        System.out.println("end");
    }
}

class Message {
    String message;

    public void update() {
        this.notify();
        this.notifyAll();
    }
}


class Display {
    public void m() {

    }
}


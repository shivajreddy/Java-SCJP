public class Demo {

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        Thread1 t1 = new Thread1(a, b);
        Thread t2 = new Thread2(a, b);

        t1.start();
        t2.start();

    }
}

class Thread1 extends Thread {
    A a;
    B b;

    public Thread1(A a, B b) {
        // a = this.a;
        // b = this.b;
        this.a = a;
        this.b = b;
        System.out.println("Thread1 a,b :" + a + "," + b);
    }

    public void run() {
        a.d1(b);
    }
}

class Thread2 extends Thread {
    A a;
    B b;

    public Thread2(A a, B b) {
        // a = this.a;
        // b = this.b;
        this.a = a;
        this.b = b;
        System.out.println("Thread1 a,b :" + a + "," + b);
    }

    public void run() {
        b.d2(a);
    }
}


class A {
    synchronized void d1(B b) {
        System.out.println("d1 meth starting");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }
        System.out.println("calling last() on b object");
        b.last();
        System.out.println("finished d1 on A");
    }

    synchronized void last() {
        System.out.println("last on A");
    }
}

class B {
    synchronized void d2(A a) {
        System.out.println("d2 meth starting");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        }
        System.out.println("calling last() on a object");
        a.last();
        System.out.println("Finished d2 on B");
    }

    synchronized void last() {
        System.out.println("last on B");
    }
}

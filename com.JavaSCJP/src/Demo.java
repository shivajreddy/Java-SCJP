public class Demo {
    public static void main(String[] args) {
        Animator myAnim = new Animator();
        Thread t = new Thread(myAnim);
        t.start();
    }
}


class Animator implements Runnable {
    boolean animating = true;

    @Override
    public void run() {
        while (animating) {
            System.out.println("Move apples one frame");
        }
    }
}


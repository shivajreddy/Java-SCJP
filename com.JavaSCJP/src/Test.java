public class Test
{
  public static void main(String[] args) throws InterruptedException
  {
    // Thread main = Thread.currentThread();

    MyThread t = new MyThread();
    // MyThread t2 = new MyThread();
    // t2.start();
    // t.join();
    // t.start();

    t.join();
    t.start();


    for (int i = 0; i < 10; i++){
      System.out.println("main thread");
    }
  }
}

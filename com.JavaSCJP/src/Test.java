public class Test
{
  public static void main(String[] args)
  {

    MyThread t = new MyThread();
    t.start();
    System.out.println("by: " + Thread.currentThread().getName());
  }
}

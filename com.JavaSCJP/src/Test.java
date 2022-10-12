public class Test
{
  public static void main(String[] args)
  {
    MyThread t = new MyThread();
    t.setPriority(10);
    t.start();

    for (int i = 0; i < 10; i++){
      System.out.println("main : " + i + " with priority: " + Thread.currentThread().getPriority());
    }
  }
}

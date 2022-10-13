public class SeethaThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++)
      {
      System.out.println("seetha job");

      try
        {
        Thread.sleep(250);
        } catch (InterruptedException e)
        {
        System.out.println(e);
        }
      }
  }
}
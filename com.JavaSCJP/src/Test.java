public class Test {
  public static void main(String[] args) throws InterruptedException {

    SeethaThread t = new SeethaThread();

    t.start();

    t.join(500);     // this method call must handle InterruptedException -> either try/catch or thrwos IE

    for (int i = 0; i < 5; i++)
      {
      System.out.println("rama thread");
      }

  }
}

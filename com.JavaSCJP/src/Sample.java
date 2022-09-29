public class Sample
{
  public static void main(String[] args)
  {
    ServiceProvider sp = new SubServiceProvider();
    sp.m1();
    sp.m2();
    System.out.println(A.name);
  }
}


interface Interface{
  void m1();
  void m2();
}

abstract class ServiceProvider implements Interface{

  @Override
  public void m1() {
    System.out.println("this is implemented method1");
  }

}

class SubServiceProvider extends ServiceProvider
{
  @Override
  public void m2()
  {
      System.out.println("this is implemented method2");
  }
}


interface A{
  public static final String name = "shiva";
  void m1();
}

interface  B{
  void m2();
}

interface C extends A,B{

  void m1();
}

abstract class Simple extends Sample implements A,B{

  @Override
  public void m1() {

  }

}

// abstract class X implements A extends Sample{}


abstract class Classo{
  private abstract class AnotherClasso{}

  abstract void methodOne();
}
package pack1;
public class A
{
  protected void method1()
  {
    System.out.println("this is method 1. inside class A");
  }
}

class C
{
  public void meth()
  {
    A a = new A();
    a.method1();

  }
}

/* 1.5 hours of Final Variables
Instance Variables
Static Variables
Local Variables
 */

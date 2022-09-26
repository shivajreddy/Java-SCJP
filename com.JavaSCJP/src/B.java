import pack1.A;

public class B extends C
{
  public static void main(String[] args)
  {
    B b = new B();
    b.method1();

    C c = new C();
  }
}

class C extends A
{
  public void meth2(){
    C c = new C();
    c.method1();
    //
    A a = new A();
    a.method1();
  }

}

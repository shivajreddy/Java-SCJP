public class Test
{
  public static void main(String[] args)
  {

    CasioCalc c1 = new CasioCalc();

    CasioCalc.m1();
    c1.m1();
    c1.mx();
    c1.m2();

  }
}


abstract strictfp class Calc
{
  // default method -> legal
  static void m1(){
    System.out.println("static method");
  }

  // floating values in any method follow IEEE754
  public double m2()
  {
    System.out.println(10.0);
    return 10.0;
  }

  // Abstract methods for child classes to implement
  abstract void mx();
}

class CasioCalc extends Calc
{

  @Override
  void mx()
  {
    System.out.println("this");
  }
}

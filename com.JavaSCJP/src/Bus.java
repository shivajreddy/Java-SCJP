abstract class Vehicle
{
  public abstract void m1();
  public abstract void m2();
}

public class Bus
{
  public static void main(String[] args)
  {
    Car c = new Car();
    c.m1();
    c.m2();
    c.m3();
  }
}

class Car extends Vehicle
{
  public void m1()
  {
    System.out.println("m1");
  }
  public void m2()
  {
    System.out.println("m2");
  }
  public void m3()
  {
    System.out.println("m3");
  }
}



public class Parent
{
  void m1(){
    System.out.println("parent m1");
  }
}


class Child extends Parent
{
  void m1(){
    System.out.println("child m1");
  }
  void m2(){}
}
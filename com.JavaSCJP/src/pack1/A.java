package pack1;

public abstract class A
{

  public void methodOne(){
    System.out.println("methodOne from class A");
  }

  private int age;

  abstract String name();

}

class C extends A
{
  @Override
  String name() {
    return "shiva";
  }
}

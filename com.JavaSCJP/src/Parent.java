public abstract class Parent
{

  public static void main(String[] args)
  {
    Kid kid1 = new Kid() {
      @Override
      public void m1() {

      }
    };

    kid1.marriage();

  }

  public void property()
  {
    System.out.println("you get all my cash and land");
  }

  public void marriage()
  {
    System.out.println("Laxmi wife");
  }

  public abstract void m1();

}

abstract class Kid extends  Parent
{
  // @Override
  public void marriage(){
    // super.marriage();
    System.out.println("this is new wife");
  }

}

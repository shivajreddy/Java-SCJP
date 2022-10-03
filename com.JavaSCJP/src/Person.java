public class Person{
  private void m(){
    System.out.println("parent version");
  }

}

class Student extends Person{


  public void m(){
    System.out.println("child version");
  }
}
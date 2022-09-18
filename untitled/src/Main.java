class StudentBean
{
  private String name;

  // setter
  public void setName(String name){
    this.name = name;
  }

  // getter
  public String getName(){
    return name;
  }

}


public class Main
{

  public static void main(String[] args){
    System.out.println("this is the parent main method");
  }

  StudentBean shiva = new StudentBean();

}

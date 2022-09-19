public class Main {
  public static void main(String[] args) {

    Operators op = new Operators();

//    System.out.println(Double.NaN == Double.NaN);
//    System.out.println(Double.NaN != Double.NaN);

    System.out.println((0/0.0)!=(0.0/0));


    System.out.println('a' + 0.1);

    System.out.println(10/-0.0);
    System.out.println(-10/-0.0);


    String a = "durga";
    int b = 10, c = 20, d = 30;

    System.out.println(a + b + c + d);
    System.out.println(b + c + d + a);

    Student s1 = new Student();
    Student s2 = new Student();

    System.out.println(97 == 97.0);

    System.out.println("shiva".equals("shiva"));
    System.out.println("shiva" == "shiva");
    String same1 = new String("shiva");
    String same2 = new String("shiva");
    System.out.println(same2 == same1);
  }
}

class Student{
  public static String name = "student";

  public void meth(){
    Thread t = new Thread();  // child
    Object o = new Object();  // parent
    String s = new String();  // child

    System.out.println(t == o);
    System.out.println(o == s);
//    System.out.println(t == s); // t and s are totally unrelated objects so C.E


  }

}

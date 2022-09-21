import java.lang.reflect.Constructor;

public class Test {

  public static void main(String[] args) throws Exception {


    /* Difference between ClassNotFoundException & NoClassFoundException:
    When hard coded using `ClassName c = new ClassName();` if the ClassName isn't found then NoClassFoundException. -> This is un-checked exception.
    For dynamically provided classname, if the corresponding .class is not available then  -> This is a checked exception.
     */
    // int i = 10;

    Thread t = new Thread();

    System.out.println(t instanceof java.lang.String);
    System.out.println(t instanceof Runnable);


    System.out.println(Class.forName(args[0]).isInstance(t));
    // System.out.println(i instanceof Integer);

    /* Difference between `instanceof` and `isInstance()`

     */

  }

}

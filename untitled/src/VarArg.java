public class VarArg {
  /* var-arg methods

  variable number of argument methods i.e., methods with any number of args

  method_1(int x, int... y) // valid
  method_1(String x, double... y) // valid
  method_1(double... d, String s) // InValid, last arg should be variable arg
  method_1(char ch, String... s) // valid
  Introduced in 1.5 Java
   */

  public static void methodOne(int[]... x){
    System.out.println(x[0][0]);
  }

  public static void meth(){
    VarArg.methodOne();
  }

}

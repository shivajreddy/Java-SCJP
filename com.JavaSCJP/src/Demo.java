
public class Demo
{

    private class Inner1{}
    protected class Inner2{}
    static class Inner3{}
    class Inner4{}

    // synchronized int x = 0;  // only for methods
    volatile int x1 = 0;    // only for methods
    transient int x2 = 10;
    // strictfp int x3 = 10;    // only for methods
    // native int x4 = 10;  // only for methods

    public void m1(){}
    private void m2(){}
    protected void m3(){}
    static void m4(){}
    final void m5(){}
    // * abstract void m6();  // only available for abstract class
    synchronized void m7(){}
    // volatile void m8(){}    // only for variables
    // transient void m9(){}    // only for variables
    strictfp void m10(){};  // strictfp is not needed from java17
    native void m11();

}

abstract class Hi{
    public final double pi = 3.14;
    public void m(){
        System.out.println(pi);
    }
}

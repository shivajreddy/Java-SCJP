public class Test
{

    public static void main(String[] args)
    {
        System.out.println("Outer class main method");
    }

    // Inner class
    class Inner
    {
        public static void main(String[] args)
        {
            System.out.println("Inner class main method");
        }

        void method1()
        {
            System.out.println("this is inner class method1");
        }
    }

}

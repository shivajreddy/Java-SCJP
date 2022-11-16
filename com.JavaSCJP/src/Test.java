public class Test
{
    int instance_x = 10;
    static int static_x = 10;

    public static void main(String[] args)
    {
        System.out.println("static_x = " + Test.static_x);

        Test t = new Test();
        System.out.println("instance_x = " + t.instance_x);
        t.instance_x = 999;
        t.static_x = 10000;

        Test t2 = new Test();
        System.out.println("static_x = " + Test.static_x);
        System.out.println("instance_x = " + t2.instance_x);
    }
}

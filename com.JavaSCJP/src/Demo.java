import java.util.Arrays;

public class Demo
{
    int instance_x = 10;
    static int static_x = 10;
    static int[] static_arr;

    public static void main(String[] args)
    {
        // System.out.println(Arrays.toString(static_arr));
        System.out.println("hi");
    }

    void m1()
    {
        System.out.println(static_x);
        System.out.println(Arrays.toString(static_arr));
    }
}

class Animal
{
    static int[] s_arr;

    void m1()
    {
        int[] arr;
        System.out.println(Arrays.toString(s_arr));
        // System.out.println(Arrays.toString(arr));
    }
}

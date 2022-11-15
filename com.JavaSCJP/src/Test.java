import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        // int[][] arr = {{1, 2, 3}, {10, 20, 30}};
        // System.out.println(Arrays.toString(arr[0]) + " " + Arrays.toString(arr[1]));

        Doctor d = new Doctor();
        Doctor d1 = new Doctor();
        Staff[] arr = {d};
        Staff[] staff_arr = {d, d1};

        int[] iarr = {1, 2, 3, 'a'};
        char[] carr = {'a', 'b', 'c', 10000, 0b1000000000000000};
        System.out.println(Arrays.toString(carr));
        System.out.println("end");
    }
}

class Doctor implements Staff
{

    @Override
    public void assist()
    {
        System.out.println("Doc is assisting");
    }
}

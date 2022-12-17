import java.util.Enumeration;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        for (int i = 0; i < 10; i++) {
            vector.addElement(i);
        }

        System.out.println(vector);

        // We can get the Enumeration cursor from Vector using .elements()
        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            int i = (int) enumeration.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

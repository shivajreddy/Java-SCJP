import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> personTree = new TreeSet<>();

        personTree.add(new Person(21, "queue"));
        personTree.add(new Person(23, "shiva"));
        personTree.add(new Person(27, "reddy"));

        System.out.println("personTree = " + personTree); // [Person{queue:21}, Person{shiva:23}, Person{reddy:27}]

    }
}

class Person implements Comparable {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + name + ":" + age + "}";
    }

    @Override
    public int compareTo(@NotNull Object o) {
        int person1Age = this.getAge(); // new object we are inserting
        int person2Age = ((Person) o).getAge();  // object that already exists
        if (person1Age < person2Age) {
            return -1;
        } else if (person1Age > person2Age) {
            return 1;
        }
        return 0;
    }
}


/* comparison's b/w Comparable(I) & Comparator(I)
 *
 * Comparable(I) -> default natural sorting order
 */

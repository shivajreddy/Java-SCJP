import java.util.Comparator;
import java.util.TreeSet;

/* Comparator(I) -> custom sorting order
 *
 * 2 methods -> 1. public int compare(obj1, obj2); 2.public boolean equals(object obj);
 * should only implement 1 method -> compare(obj1, obj2);
 */

public class Main {
    public static void main(String[] args) {

        // TreeSet<Person> personTree = new TreeSet<>(new PersonAgeOrder());
        //
        // personTree.add(new Person(27, "A"));
        // personTree.add(new Person(27, "A2"));
        // personTree.add(new Person(21, "Z"));
        // personTree.add(new Person(32, "D"));
        //
        // System.out.println("personTree = " + personTree);

        TreeSet<String> ts = new TreeSet<>(new MyComparator());

        ts.add("A");
        ts.add("ABC");
        ts.add("xx");
        ts.add("AA");
        ts.add("ABCD");
        ts.add("A");

        System.out.println("ts = " + ts); // [A, AA, xx, ABC, ABCD]

    }
}


class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        // return -s1.compareToIgnoreCase(s2);
        return s2.compareToIgnoreCase(s1);
    }
}




class PersonAgeOrder implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person newPerson = (Person) o1;
        Person oldPerson = (Person) o2;
        return -newPerson.getName().compareTo(oldPerson.getName());
        // if (newPerson.getAge() < oldPerson.getAge()) {
        //     return -1;
        // } else if (newPerson.getAge() > oldPerson.getAge()) {
        //     return 1;
        // }
        // return 0;
    }
}

class Person {
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
}

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Person> personTree = new TreeSet<>(new PersonAgeOrder());

        personTree.add(new Person(27, "reddy"));
        personTree.add(new Person(21, "shiva"));
        personTree.add(new Person(32, "ShivaReddy"));

        System.out.println("personTree = " + personTree);


    }
}

/* Comparator(I) -> custom sorting order
 *
 * 2 methods -> 1. public int compare(obj1, obj2); 2.public boolean equals(object obj);
 * should only implement 1 method -> compare(obj1, obj2);
 */


class PersonAgeOrder implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person newPerson = (Person) o1;
        Person oldPerson = (Person) o2;
        if (newPerson.getAge() < oldPerson.getAge()) {
            return -1;
        } else if (newPerson.getAge() > oldPerson.getAge()) {
            return 1;
        }
        return 0;
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

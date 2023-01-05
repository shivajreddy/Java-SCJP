import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
        takeAnimals(dogs);

        ArrayList<Animal> arr = new ArrayList<>();
        arr.add(new Dog());
        arr.add(new Dog());
        arr.add(new Cat());

        takeObjects(new ArrayList<>());

        takeDogs(new ArrayList<>());
    }

    public static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    public static void takeObjects(ArrayList<Object> objects){}

    public static void takeDogs(List<Dog> dogs){}
}


abstract class Animal {
    public void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("cat meows");
    }
}


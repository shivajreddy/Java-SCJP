public class ProtectedDemo {

    public static void main(String[] args) {

        Bike b = new Bike();
        // b.direction();

        Car c = new Car();
        // c.direction();

        Automobile car1 = new Car();
        car1.direction();

        // System.out.println(car1.wheelCount);


    }
}


class Automobile {

    void direction() {
        System.out.println("moves only forward");
    }

}


class Bike extends Automobile {
    int wheelCount = 2;

}

class Car extends Automobile {

    int wheelCount = 4;

    void direction() {
        System.out.println("goes back and forward");
    }
}


class Vw extends Car{}

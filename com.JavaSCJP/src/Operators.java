public class Operators{
  public static void main(String[] args) {

    Person p = new Person();
    Vehicle v = new Vehicle();
    Computer c = new Computer();

//    System.out.println(p instanceof Vehicle);

    Object[] arr = {p, v, c};

    Object o1 = arr[0];
    Object o2 = arr[1];
    Object o3 = arr[2];

    System.out.println(o1 instanceof Vehicle);

    if (o1 instanceof Person){
      System.out.println("is of type Person");
    } else if (o1 instanceof Vehicle) {
      System.out.println("is of type Vehicle");
    } else if (o1 instanceof Computer) {
      System.out.println("is of type Computer");
    } else {
      System.out.println("Just an plain object");
    }

  }


}


class Person{

}

class Vehicle{

}

class Computer{

}

public abstract class Person{

  String name;
  int age;
  int height;
  String eyes;

  Person(String name, int age, int height, String eyes){
    this.name = name;
    this.age = age;
    this.height = height;
    this.eyes = eyes;
  }

}

class Student extends Person{

  String school;
  Student(String name, int age, int height, String eyes, String school) {
    super(name, age, height, eyes);
    this.school = school;
  }
}

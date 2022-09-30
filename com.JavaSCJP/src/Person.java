public class Person{

  String name;
  int age;

  Person(String name, int age){
    System.out.println("Person's constructor");
    System.out.println(this);
    this.name = name;
    this.age = age;
  }
}

class Student extends Person{
  int rollno;
  int marks;

  Student(String name, int age, int rollno, int marks){
    // System.out.println("Student's constructor");
    //cant write any line before super not even print like above. or C.E as below
    //java: call to super must be first statement in constructor
    super(name, age);
    System.out.println("Student's constructor");
    System.out.println(this);
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.rollno);
    System.out.println(this.marks);
    this.rollno = rollno;
    this.marks = marks;
    System.out.println();
  }
}

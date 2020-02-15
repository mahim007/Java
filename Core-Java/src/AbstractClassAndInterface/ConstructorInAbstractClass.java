package AbstractClassAndInterface;

abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    public Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class Teacher extends Person {
    int salary;
    String subject;

    public Teacher(String name, int age, int salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }
}


public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Student student = new Student("mahim", 25, 13048, 80);
        Teacher teacher = new Teacher("people", 52, 50000, "math");
        System.out.println(student.toString());
        System.out.println(teacher.toString());
    }
}

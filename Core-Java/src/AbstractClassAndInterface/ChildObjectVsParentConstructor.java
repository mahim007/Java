package AbstractClassAndInterface;

class Person1 {
    String name;
    int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student1 extends Person1 {
    int rollNo;
    int marks;

    public Student1() {
    }

    public Student1(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class ChildObjectVsParentConstructor {
    public static void main(String[] args) {
        Student1 Student1 = new Student1("mahim", 26, 13048, 70);
        System.out.println(Student1.getRollNo() + " " + Student1.getMarks());
    }
}

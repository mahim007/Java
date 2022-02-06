package com.mahim.learningjava17.generics;

public class Test {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<>("mahim");
        g1.show();
        System.out.println(g1.get());

        Gen<Integer> g2 = new Gen<>(10);
        g2.show();
        System.out.println(g2.get());

        Student student = new Student(1, "mahim", "mahim@gmail.com");
        Gen<Student> g3 = new Gen<>(student);
        g3.show();
        System.out.println(g3.get());
        Student anotherStudent = g3.get();
        System.out.println(anotherStudent);
        System.out.println("no type casting needed!");
    }
}

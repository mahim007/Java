package com.mahim.learningjava17.staticControlFlow;

public class StaticDemo {
    static int i = 10;
    static {
        m1();
        System.out.println("First static block.");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main method");
    }
    public static void m1() {
        System.out.println(j);
    }
    static {
        System.out.println("Second static block");
    }
    static int j = 20;
}

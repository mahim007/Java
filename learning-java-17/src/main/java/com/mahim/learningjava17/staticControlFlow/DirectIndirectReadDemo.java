package com.mahim.learningjava17.staticControlFlow;

public class DirectIndirectReadDemo {
    static int i = 10;
    static {
        m1();
        System.out.println(i); // direct read
    }
    public static void m1() {
        System.out.println(i); // indirect read
    }

//    public static void main(String[] args) {
//
//    }
}

package com.mahim.learningjava17.constructors;

import java.io.IOException;

class P1 {
    P1() throws IOException {}
}
public class Test1 extends P1 {

    Test1() throws IOException {
        super();
        System.out.println("no-arg constructor");
    }
    public static void main(String[] args) throws IOException {
        Test1 t = new Test1();
    }
}

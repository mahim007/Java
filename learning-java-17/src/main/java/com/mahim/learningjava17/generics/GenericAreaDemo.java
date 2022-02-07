package com.mahim.learningjava17.generics;

import java.util.ArrayList;

public class GenericAreaDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("mahim");
        l.add("ashraful");
//        l.add(10); // CE
        m1(l);
        System.out.println(l);
//        l.add(10.5); // CE
    }

    private static void m1(ArrayList l) {
        l.add(10);
        l.add(101.223);
        l.add(true);
    }
}

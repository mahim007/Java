package com.mahim.learningjava17.generics;

import java.util.ArrayList;

public class Test3 {
    public void m1(ArrayList<String> l) {} // CE : name clash: m1(java.util.ArrayList<java.lang.Integer>) and m1(java.util.ArrayList<java.lang.String>) have the same erasure
    public void m1(ArrayList<Integer> l) {}

    public static void main(String[] args) {

    }
}

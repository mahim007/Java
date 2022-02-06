package com.mahim.learningjava17.generics;

public class Test {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<>("mahim");
        g1.show();
        System.out.println(g1.get());

        Gen<Integer> g2 = new Gen<>(10);
        g2.show();
        System.out.println(g2.get());
    }
}

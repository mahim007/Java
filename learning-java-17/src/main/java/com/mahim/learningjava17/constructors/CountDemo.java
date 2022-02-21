package com.mahim.learningjava17.constructors;

public class CountDemo {
    private static int count = 0;

    {
        count++;
    }

    CountDemo() {
        System.out.println("no-arg constructor");
    }

    CountDemo(int i) {
        System.out.println("int-arg constructor");
    }

    CountDemo(double d) {
        System.out.println("double-arg constructor");
    }

    public static void main(String[] args) {
        CountDemo d1 = new CountDemo();
        CountDemo d2 = new CountDemo(10);
        CountDemo d3 = new CountDemo(12.22);

        System.out.println(count);
    }
}

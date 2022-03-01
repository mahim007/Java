package com.mahim.learningjava17.singleton;

public class Test {
    static {
        System.out.println("first static block");
    }
    {
        System.out.println("first instance block");
    }
    private static Test t = new Test();

    static {
        System.out.println("2nd static block");
    }
    {
        System.out.println("2nd instance block");
    }

    private Test() {
        System.out.println("constructor call");
    }

    public static Test getTest() {
        return t;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Test test = Test.getTest();
        Test test1 = Test.getTest();

        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
    }
}

//output:
//        first static block
//        first instance block
//        2nd instance block
//        constructor call
//        2nd static block
//        main method
//        245257410
//        245257410

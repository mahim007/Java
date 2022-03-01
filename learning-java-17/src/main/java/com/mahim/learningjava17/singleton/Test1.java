package com.mahim.learningjava17.singleton;

public class Test1 {
    static {
        System.out.println("first static block");
    }
    {
        System.out.println("first instance block");
    }
    private static Test1 t = null;

    static {
        System.out.println("2nd static block");
    }
    {
        System.out.println("2nd instance block");
    }

    private Test1() {
        System.out.println("constructor call");
    }

    public static Test1 getTest() {
        if (t == null) t = new Test1();
        return t;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Test1 test = Test1.getTest();
        Test1 test1 = Test1.getTest();

        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
    }
}

//output:
//        first static block
//        2nd static block
//        main method
//        first instance block
//        2nd instance block
//        constructor call
//        245257410
//        245257410

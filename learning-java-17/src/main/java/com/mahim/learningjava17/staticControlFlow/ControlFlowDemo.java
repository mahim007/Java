package com.mahim.learningjava17.staticControlFlow;

public class ControlFlowDemo {
    {
        System.out.println("FIB");
    }
    static {
        System.out.println("FSB");
    }
    ControlFlowDemo() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        ControlFlowDemo d1 = new ControlFlowDemo();
        System.out.println("main method");
        ControlFlowDemo d2 = new ControlFlowDemo();
    }

    static {
        System.out.println("SSB");
    }
    {
        System.out.println("SIB");
    }
}

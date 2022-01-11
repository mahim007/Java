package com.mahim.learningjava17.synchronization;

public class MyThread1 extends Thread {
    Table t;

    public MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        this.t.printTable(5, "thread#1");
    }
}

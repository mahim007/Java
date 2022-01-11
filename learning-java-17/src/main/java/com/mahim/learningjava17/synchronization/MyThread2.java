package com.mahim.learningjava17.synchronization;

public class MyThread2 extends Thread {
    Table t;

    public MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        this.t.printTable(100, "thread#2");
    }
}

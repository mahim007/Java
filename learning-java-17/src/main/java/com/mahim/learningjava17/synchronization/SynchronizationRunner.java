package com.mahim.learningjava17.synchronization;

public class SynchronizationRunner {
    public static void main(String[] args) {
        Table table = new Table();

        MyThread1 thread1 = new MyThread1(table);
        MyThread2 thread2 = new MyThread2(table);

        thread1.start();
        thread2.start();
    }
}

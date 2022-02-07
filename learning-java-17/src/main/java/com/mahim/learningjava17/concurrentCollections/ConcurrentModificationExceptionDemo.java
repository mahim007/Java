package com.mahim.learningjava17.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionDemo extends Thread {

    static ArrayList l = new ArrayList();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception happened in child thread...");
        }

        System.out.println("Child Thread updating list: ");
        l.add("X");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("mahim");
        l.add("A");
        l.add("B");
        l.add("C");

        ConcurrentModificationExceptionDemo childThread = new ConcurrentModificationExceptionDemo();
        childThread.start();

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            System.out.println("Main Thread reading, current item: " + next);
            Thread.sleep(2000);
        }

        System.out.println(l);
    }
}

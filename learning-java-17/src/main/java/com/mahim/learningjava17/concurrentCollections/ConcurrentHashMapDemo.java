package com.mahim.learningjava17.concurrentCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo extends Thread {
    private static ConcurrentHashMap m = new ConcurrentHashMap();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred in child thread");
        }

        System.out.println("Updating concurrent hashmap...");
        m.put(107, "3rd item");
        //System.out.println(m);
    }

    public static void main(String[] args) throws InterruptedException {
        m.put(101, "1st item");
        m.put(102, "2nd item");

        ConcurrentHashMapDemo thread = new ConcurrentHashMapDemo();
        thread.start();

        Set keySet = m.keySet();
        for (Object o : keySet) {
            Integer next = (Integer) o;
            System.out.println("main thread iterating map, current item: " + next + " value: " + m.get(next));
            sleep(3000);
        }

        //Thread.sleep(2000);
        System.out.println(m);
    }
}

package com.mahim.learningjava17.concurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveMethodDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList l = new CopyOnWriteArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        l.remove(new Integer(2));
        System.out.println(l);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            if (next == 3) {
                iterator.remove();
            }
        }
    }
}

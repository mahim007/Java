package com.mahim.learningjava17.concurrentCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Map1 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(100, "mahim");
        m.put(100, "ashraful");
        System.out.println(m);

        m.replace(100, "new value");
        System.out.println(m);

        m.remove(100);
        System.out.println(m);

        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put(100, "mahim");
        concurrentMap.putIfAbsent(100, "ashraful");
        System.out.println(concurrentMap);

        concurrentMap.replace(100, "mahim", "new value");
        System.out.println(concurrentMap);

        concurrentMap.remove(100, "new value");
        System.out.println(concurrentMap);
    }
}

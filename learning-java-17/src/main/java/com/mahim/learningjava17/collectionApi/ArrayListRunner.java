package com.mahim.learningjava17.collectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.ensureCapacity(20);

        integers.add(10);
        integers.add(2);
        integers.add(13);

        for (Integer next : integers) {
            System.out.println(next);
        }

        System.out.println(integers.contains(11));
        System.out.println(integers.contains(13));

        integers.add(2, 500);
        integers.add(2, 1000);
        integers.add(0, -1000);

        System.out.println("### test add method ###");
        for (Integer next : integers) {
            System.out.println(next);
        }

        integers.set(0,0);
        System.out.println("### test set method ###");
        System.out.println(integers);


        System.out.println("### sorting ###");
        integers.sort(Integer::compareTo);
        System.out.println(integers);

        System.out.println("--- to array method");
        Object[] objects = integers.toArray();
        for (Object item : objects) {
            System.out.println(item);
        }

        System.out.println("### for each method ###");
        integers.forEach(integer -> {
            int i = integer + 100;
            System.out.println(i);

        });

        Object clone = integers.clone();
        System.out.println("clone" + clone);
        System.out.println(clone.equals(integers));
        System.out.println(clone.getClass());
        System.out.println(integers.getClass());
        System.out.println(objects.getClass());

        integers.clear();
        System.out.println("###clearing all data ###");
        integers.add(0,3);
        integers.add(1,1);
        integers.add(1,2);
        integers.add(2,1);

        integers.removeAll(Collections.singleton(Integer.valueOf("1")));
        System.out.println(integers);

    }
}

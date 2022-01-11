package com.mahim.learningjava17.collectionApi;

import java.util.*;

public class CollectionRunner {

    public static void main(String[] args) {
        List<String> names = new Stack<>();
        names.add("mahim");
        names.add("nitol");
        names.forEach(System.out::println);

    }
}

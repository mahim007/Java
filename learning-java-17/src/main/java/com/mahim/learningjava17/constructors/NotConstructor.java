package com.mahim.learningjava17.constructors;

public class NotConstructor {
    void NotConstructor() {
        System.out.println("method but not constructor");
    }

    public static void main(String[] args) {
        NotConstructor obj = new NotConstructor();
        obj.NotConstructor();
    }
}

package com.mahim.learningjava17.generics;

public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println(obj.getClass().getName());
    }

    public T get() {
        return this.obj;
    }
}

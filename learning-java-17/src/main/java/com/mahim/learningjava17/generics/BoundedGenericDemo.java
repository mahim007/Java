package com.mahim.learningjava17.generics;

public class BoundedGenericDemo<T extends Integer> {
    public void calculate(T obj1, T obj2) {
        System.out.println(obj1 + obj2);
        System.out.println(obj1 * obj2);
        System.out.println(obj1 / obj2);
    }
    public static void main(String[] args) {
        BoundedGenericDemo<Integer> demo1 = new BoundedGenericDemo<>();
        demo1.calculate(new Integer(10), new Integer(10));
        //System.out.println(new Integer(10) + new Integer(10));

//        BoundedGenericDemo<String> demo2 = new BoundedGenericDemo<String>();
//        demo2.calculate("mahim", "mahim");
    }
}

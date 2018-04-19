/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class mythreadmain {
    public static void main(String[] args){
        mythread th=new mythread();
        mythread2 th2=new mythread2();
        System.out.println("starting my thread 1");
        th.start();
        System.out.println("starting my thread 2");
        th2.start();
        System.out.println("exiting from main thread");
    }
}

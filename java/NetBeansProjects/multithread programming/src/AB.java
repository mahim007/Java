/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class AB {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        Thread th1=new Thread(a);
        Thread th2=new Thread(b);
        th1.start();
        th2.start();
    }
}

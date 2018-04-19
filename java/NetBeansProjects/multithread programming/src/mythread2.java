/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class mythread2 extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("B");
        }
        System.out.println("thread 2 ended");
    }
}

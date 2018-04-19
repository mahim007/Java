/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class mythread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("A");
        }
        System.out.println("thread 1 ended");
    }
}

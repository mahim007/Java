/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class B implements Runnable{

    @Override
    public void run() {
        global g=new global();
        for(int i=1;i<=5;i++){
            g.callme("B");
        }
        System.out.println("B ended");
    }
    
}

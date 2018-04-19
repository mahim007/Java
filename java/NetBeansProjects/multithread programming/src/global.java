/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class global {
     void callme(String s){
        System.out.println("calling from "+s);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.err.println("exception caught");
        }
    }
}

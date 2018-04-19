/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Set;
import sun.text.normalizer.UBiDiProps;

/**
 *
 * @author Ashraful
 */
public class circle {
    private double rad;
    
    public circle(){
        
    }

    public circle(double rad) {
        this.rad = rad;
    }
    
    public void Setrad(double rad){
        this.rad=rad;
    }
    
    public double getrad(){
        return rad;
    }
    
    public double getarea(){
        return Math.PI*rad*rad;
    }
}

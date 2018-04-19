/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Ashraful
 */
public class testcircle {
    public static void main(String[] args) {
       circle c1=new circle();
       circle c2=new circle();
       
       c1.Setrad(1);
       c2.Setrad(3.44);
       
        System.out.println("circle 1 area="+c1.getarea() + " circle 2 area="+c2.getarea());
    }
}

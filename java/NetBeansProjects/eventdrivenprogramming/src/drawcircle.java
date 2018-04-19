
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class drawcircle extends JPanel{
    private int rad=5;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(getWidth()/2-rad, getHeight()/2-rad, 2*rad, rad*2);
    }
}


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class keyevents extends Applet implements KeyListener{
    String msg="";
    int x=10,y=20;
    @Override
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        msg+=e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("key released");
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString(msg, x, y);
    }
}

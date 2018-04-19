
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class allmouseevent extends Applet implements MouseListener, MouseMotionListener{
    String msg="";
    int mousex=0,mousey=0;
    @Override
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        mousex=0;
        mousey=10;
        msg="mouse clicked";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mousex=e.getX();
        mousey=e.getY();
        msg="down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mousex=e.getX();
        mousey=e.getY();
        msg="up";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mousex=0;
        mousey=10;
        msg="mouse entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mousex=0;
        mousey=10;
        msg="mouse exited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mousex=e.getX();
        mousey=e.getY();
        msg="*";
        showStatus("dragging mouse at " + mousex + "," + mousey);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        showStatus("movig mouse at " + e.getX() + "," +getY());
    }
    @Override
    public void paint(Graphics g){
        g.drawString(msg, mousex, mousey);
    }
}

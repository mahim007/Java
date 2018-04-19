
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class movemessage extends JFrame{
 //private stillClock clock=new stillClock();
    public movemessage() throws HeadlessException {
        moveable p=new moveable("welcome to java");
        add(p);
    }
    public static void main(String[] args){
        movemessage frame=new movemessage();
        frame.setTitle("the message is moving");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    class moveable extends JPanel{
        private String s="welcome to java";
        private int x=20;
        private int y=20;
        public moveable(String p){
            s=p;
            addMouseMotionListener(new MouseMotionListener() {

                @Override
                public void mouseDragged(MouseEvent e) {
                    
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                    x=e.getX();
                    y=e.getY();
                    repaint();
                }
            });
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawString(s, x, y);
        }
    }
}

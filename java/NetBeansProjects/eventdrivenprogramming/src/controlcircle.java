
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class controlcircle extends JFrame{
    private JButton jbtbig=new JButton("enlarge");
    private JButton jbtsmall=new JButton("shrink");
    drawcircle canvas=new drawcircle();
    public controlcircle(){
        JPanel p1=new JPanel();
        p1.add(jbtbig);
        p1.add(jbtsmall);
        jbtbig.addActionListener(new enlargelistener());
        jbtsmall.addActionListener(new shrinklistener());
        this.add(p1, BorderLayout.SOUTH);
        this.add(canvas,BorderLayout.CENTER);
    }
    public static void main(String[] args){
        controlcircle frame=new controlcircle();
        frame.setTitle("controling a circle");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    static class drawcircle extends JPanel{
        private int rad=5;
        public void enlarge(){
            rad+=10;
            if(rad>100){
                rad=100;
            }
            repaint();
        }
        public void shrink(){
            rad-=10;
            if(rad<0){
                rad=0;
            }
            repaint();
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(getWidth()/2-rad, getHeight()/2-rad, rad*2, rad*2);
        }
    }
    
    class enlargelistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.enlarge();
        }
        
    }
    class shrinklistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            canvas.shrink();
        }
        
    }
}

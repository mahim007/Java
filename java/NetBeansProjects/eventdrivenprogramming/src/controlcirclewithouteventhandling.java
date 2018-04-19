
import java.awt.BorderLayout;
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
public class controlcirclewithouteventhandling extends JFrame{
    private JButton jbtbig=new JButton("enlarge");
    private JButton jbtsmall=new JButton("shrink");
    drawcircle canvas=new drawcircle();
    public controlcirclewithouteventhandling(){
        JPanel p1=new JPanel();
        p1.add(jbtbig);
        p1.add(jbtsmall);
        this.add(p1, BorderLayout.SOUTH);
        this.add(canvas,BorderLayout.CENTER);
    }
    public static void main(String[] args){
        controlcirclewithouteventhandling frame=new controlcirclewithouteventhandling();
        frame.setTitle("drawing a circle");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

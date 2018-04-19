
import java.awt.FlowLayout;
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
public class handleevent extends JFrame{
    public handleevent(){
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout());
        JButton ok=new JButton("ok");
        JButton cancel=new JButton("cancel");
        p1.add(ok);
        p1.add(cancel);
        add(p1);
        okclass oklistener=new okclass();
        cancelclass cancellistener=new cancelclass();
        ok.addActionListener(oklistener);
        cancel.addActionListener(cancellistener);
    }
    public static void main(String[] args){
        handleevent frame=new handleevent();
        frame.setTitle("button event");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class label extends JFrame{
    public label(){
        JPanel p1=new JPanel();
        p1.setLayout(new BorderLayout());
        ImageIcon icon=new ImageIcon("books-stack.jpg");
        JLabel lbl=new JLabel("grape", icon, JLabel.CENTER);
        lbl.setHorizontalTextPosition(JLabel.CENTER);
        lbl.setVerticalTextPosition(JLabel.BOTTOM);
        lbl.setIconTextGap(10);
        p1.add(lbl,BorderLayout.CENTER);
        add(p1);
    }
    public static void main(String[] args){
        label frame=new label();
        frame.setTitle("icon + text");
        frame.setSize(400,300);
        //frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}

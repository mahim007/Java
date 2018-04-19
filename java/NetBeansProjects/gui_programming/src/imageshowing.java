
import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
public class imageshowing extends JFrame{
    public imageshowing(){
        JPanel p1=new JPanel();
        p1.setLayout(new BorderLayout(5, 5));
        ImageIcon img=new ImageIcon("IMG_56837436719021.jpeg");
        JLabel lbl=new JLabel(img);
        JLabel lbl2=new JLabel(img);
        JLabel lbl3=new JLabel(img);
        JLabel lbl4=new JLabel(img);
        JLabel lbl5=new JLabel(img);
        p1.add(lbl,BorderLayout.NORTH);
        //p1.add(lbl2,BorderLayout.SOUTH);
        p1.add(lbl3,BorderLayout.EAST);
        //p1.add(lbl4,BorderLayout.WEST);
        //p1.add(lbl5, BorderLayout.CENTER);
        add(p1);
    }
    public static void main(String[] args){
        imageshowing frame=new imageshowing();
        frame.setTitle("image shows");
        //frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}

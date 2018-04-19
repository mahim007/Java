
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class radiobutton extends JFrame{
    public radiobutton(){
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(3, 1));
        JRadioButton java=new JRadioButton("Java");
        java.setBackground(Color.red);
        java.setForeground(Color.BLUE);
        java.setMnemonic('J');
        JRadioButton c=new JRadioButton("C",true);
        c.setBackground(Color.GREEN);
        c.setForeground(Color.BLACK);
        c.setMnemonic('C');
        ButtonGroup bg=new ButtonGroup();
        bg.add(java);
        bg.add(c);
        p1.add(java);
        p1.add(c);
        add(p1);
    }
    public static void main(String[] args){
        radiobutton frame=new radiobutton();
        frame.setTitle("showing checkbox");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //System.out.println();
    }
}

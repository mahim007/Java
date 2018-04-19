
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
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
public class checkbox extends JFrame{
    public checkbox(){
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(3, 1));
        JCheckBox java=new JCheckBox("Java");
        java.setBackground(Color.red);
        java.setForeground(Color.BLUE);
        java.setMnemonic('J');
        JCheckBox c=new JCheckBox("C",true);
        c.setBackground(Color.GREEN);
        c.setForeground(Color.BLACK);
        c.setMnemonic('C');
        p1.add(java);
        p1.add(c);
        add(p1);
        int i=1;
        while(i<=5){
            System.out.println(c.isSelected());
            System.out.println(java.isSelected());
            i++;
        }
    }
    public static void main(String[] args){
        checkbox frame=new checkbox();
        frame.setTitle("showing checkbox");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //System.out.println();
    }
}

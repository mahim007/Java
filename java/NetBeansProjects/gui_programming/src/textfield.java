
import com.sun.xml.internal.stream.Entity;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class textfield extends JFrame{
    public textfield(){
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout());
        JPasswordField jtf=new JPasswordField("ja icche tai");
        jtf.setForeground(Color.red);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        JLabel lbl=new JLabel("enter your pass word");
        p1.add(lbl);
        p1.add(jtf);
        add(p1);
        //jtf.setText("text field");
        
        String sn=jtf.getText();
        System.out.println("password is "+sn);
    }
    public static void main(String[] args){
        textfield frame=new textfield();
        frame.setTitle("text field show");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

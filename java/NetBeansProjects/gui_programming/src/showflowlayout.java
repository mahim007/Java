
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class showflowlayout extends JFrame{
    public showflowlayout(){
        GridLayout layout=new GridLayout(2,2);
        setLayout(layout);
        add(new JLabel("name"));
        add(new JTextField(10));
        add(new JLabel("roll"));
        add(new JTextField(10));
        add(new JLabel("dept"));
        add(new JTextField(10));
    }
    public static void main(String[] args){
        showflowlayout frame=new showflowlayout();
        frame.setTitle("show grid layout");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

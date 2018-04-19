
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class testpanels extends JFrame{
    public testpanels(){
        JPanel number=new JPanel();
        number.setLayout(new GridLayout(4, 3));
        for(int i=1;i<=9;i++){
            number.add(new JButton(""+i));
        }
        number.add(new JButton(""+0));
        number.add(new JButton("start"));
        number.add(new JButton("stop"));
        JPanel box=new JPanel();
        box.setLayout(new BorderLayout());
        box.add(new JTextField("time to be displayed"),BorderLayout.NORTH);
        box.add(number,BorderLayout.CENTER);
        JPanel finl=new JPanel();
        finl.setLayout(new BorderLayout());
        JButton jbtfod=new JButton("food to be placed here");
        Font f1=new Font("Serif", Font.BOLD, 20);
        jbtfod.setFont(f1);
        finl.add(jbtfod,BorderLayout.WEST);
        finl.add(box,BorderLayout.CENTER);
        number.setBackground(Color.red);
        finl.setBackground(Color.BLUE);
        add(finl);
    }
    public static void main(String[] args){
        JFrame frame=new testpanels();
        frame.setTitle("microwave oven");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class showborderlayout extends JFrame{

    public showborderlayout() throws HeadlessException {
        setLayout(new BorderLayout(5, 5));
        add(new JButton("east"), BorderLayout.EAST);
        add(new JButton("west"), BorderLayout.WEST);
        add(new JButton("north"), BorderLayout.NORTH);
        add(new JButton("south"), BorderLayout.SOUTH);
        add(new JButton("center"), BorderLayout.CENTER);
    }
    public static void main(String[] args){
        showborderlayout frame=new showborderlayout();
        frame.setTitle("border layout");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

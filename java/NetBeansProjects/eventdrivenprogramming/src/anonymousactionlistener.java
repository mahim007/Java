
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class anonymousactionlistener extends JFrame{
    public anonymousactionlistener(){
        JPanel p1=new JPanel();
        JButton ok=new JButton("OK");
        JButton no=new JButton("NO");
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok button pressed");
            }
        });
        no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("NO button pressed");
            }
        });
        p1.add(ok);
        p1.add(no);
        this.add(p1);
    }
    public static void main(String[] args){
        anonymousactionlistener frame=new anonymousactionlistener();
        frame.setTitle("anonymous action listener");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


import java.awt.FlowLayout;
import java.util.Scanner;
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
public class myframe{
    public static void main(String args[]){
        JFrame frame=new JFrame("My Frame");
        JButton ok=new JButton("ok");
        JButton no=new JButton("no");
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(ok);
        p1.add(no);
        frame.add(p1);
        //frame.add(no);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        System.out.println("A frame created...");
        //frame.setVisible(true);
        System.err.println("you wanna see the frame???");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n==1){
            frame.setVisible(true);
        }
        System.err.println("you wanna close the frame???");
        n=sc.nextInt();
        if(n==1){
            frame.setVisible(false);
        }
        System.exit(100);
    }
}

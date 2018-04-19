
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class testswing extends JFrame{
    public testswing(){
        JPanel p1=new JPanel();
        p1.setLayout(new FlowLayout());
        JButton yes=new JButton("yes");
        JButton no=new JButton("no");
        JButton cancel=new JButton("cancel");
        yes.setBackground(Color.GREEN);
        no.setBackground(Color.BLUE);
        cancel.setBackground(Color.red);
        cancel.setToolTipText("this is cancel button");
        p1.add(yes);
        p1.add(no);
        p1.add(cancel);
        p1.setBorder(new TitledBorder("three button"));
        p1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JPanel p2=new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton orange=new JButton("orange");
        JButton yellow=new JButton("yellow");
        orange.setBackground(Color.ORANGE);
        yellow.setBackground(Color.YELLOW);
        Font fnt=new Font("TimesRoman", Font.BOLD, 20);
        Border brdr=new LineBorder(Color.CYAN, 15);
        orange.setFont(fnt);
        yellow.setFont(fnt);
        orange.setBorder(brdr);
        yellow.setBorder(brdr);
        p2.add(orange);
        p2.add(yellow);
        //orange.setVisible(false);
        //yellow.setVisible(false);
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.SOUTH);
        p2.setBorder(new TitledBorder("two color"));
    }
    public static void main(String[] args){
        testswing frame=new testswing();
        frame.setTitle("testing swing");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

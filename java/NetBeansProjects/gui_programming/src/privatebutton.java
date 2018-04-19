
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class privatebutton extends JFrame{
    private JButton jbtok=new JButton("java");
    public static void main(String[] args){
        privatebutton frame=new privatebutton();
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public privatebutton(){
        Border brdr=new LineBorder(Color.yellow);
        jbtok.setToolTipText("this is java button");
        jbtok.setBorder(brdr);
        Font fnt=new Font("TimesRoman", Font.ITALIC+Font.BOLD, 20);
        jbtok.setFont(fnt);
        Cursor crsr=new Cursor(Cursor.HAND_CURSOR);
        jbtok.setCursor(crsr);
        add(jbtok);
    }
}

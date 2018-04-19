
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class calculator extends JFrame{
    private JTextField a=new JTextField(10);
    private JTextField b=new JTextField(10);
    private JTextField res=new JTextField(10);
    private JButton compute=new JButton("Compute");
    public calculator(){
        JPanel p1=new JPanel(new GridLayout(3, 2));
        p1.add(new JLabel("enter number"));
        p1.add(a);
        p1.add(new JLabel("enter a number"));
        p1.add(b);
        p1.add(new JLabel("result"));
        p1.add(res);
        this.add(p1, BorderLayout.CENTER);
        p1.setBorder(new TitledBorder("enter two number"));
        JPanel p2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(compute);
        this.add(p2,BorderLayout.SOUTH);
        compute.addActionListener(new calculation());
        
    }
    public static void main(String[] args){
        calculator frame=new calculator();
        frame.setTitle("calculating two numbers");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    class calculation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n=Integer.parseInt(a.getText());
            int m=Integer.parseInt(b.getText());
            int c=m+n;
            res.setText(String.format("%5d", c));
        }
        
    }
}

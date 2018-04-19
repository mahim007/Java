import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ashraful Islam Mahim on 1/1/15.
 */
 public class j18_06 extends Applet implements ActionListener {
    String msg="";
    public void init()
    {
        Button y=new Button("Yes");
        Button n=new Button("No");
        Button c=new Button("Cancel");

        add(y);
        add(n);
        add(c);

        y.addActionListener(this);
        n.addActionListener(this);
        c.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str=e.getActionCommand();
        if(str.equals("Yes"))
        {
            msg="You have pressed Yes";
        }
        else if(str.equals("No"))
        {
            msg="You have pressed No";
        }
        else
        {
            msg="You have pressed Cancel";
        }
        repaint();
    }
    public void paint(Graphics graphics)
    {
        graphics.drawString(msg,10,100);
    }
}

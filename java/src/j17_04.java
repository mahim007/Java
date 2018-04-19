import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Objects;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
public class j17_04 extends Applet {
    TextField text1,text2;

    public void init()
    {
        text1=new TextField(10);
        text2=new TextField(10);
        add(text1);
        add(text2);
        text1.setText("");
        text2.setText("");
    }

    public void paint(Graphics g)
    {
        int x=0,y=0,z=0;
        String s1,s2,s3;
        g.drawString("Input a number in each box and press enter to deduct:",10,50);

        try
        {
            s1=text1.getText();
            x=Integer.parseInt(s1);

            s2=text2.getText();
            y=Integer.parseInt(s2);
        }

        catch (Exception e) {}
        z=x-y;
        s3= String.valueOf(z);

        g.drawString("sum is: ",10,80);
        g.drawString(s3,50,80);
    }

    public boolean action (Event evnt,Object obj)
    {
        repaint();
        return true;
    }
}

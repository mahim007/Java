import java.applet.Applet;
import java.awt.*;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
public class j17_03 extends Applet {
    int val1,val2,sum;

    public  void paint(Graphics g)
    {
        val1=100;
        val2=200;
        sum=val1+val2;

        String s1="val1 = "+String.valueOf(val1);
        String s2="val2 = "+String.valueOf(val2);
        String s3="sum = "+String.valueOf(sum);

        g.drawString(s1,10,60);
        g.drawString(s2,10,75);
        g.drawString(s3,10,90);
    }
}

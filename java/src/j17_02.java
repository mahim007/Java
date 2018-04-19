/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
import java.awt.*;
import java.applet.*;

public class j17_02 extends Applet {
    String msg;
    public void init()
    {
        msg=getParameter("parameter value");
        if(msg==null)
            msg="Java Programming";
        msg="Welcome to"+" "+msg;
    }

    public void paint(Graphics g)
    {
        setSize(400,200);
        g.drawString(msg,20,50);
    }
}

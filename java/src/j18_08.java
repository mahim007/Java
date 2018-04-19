import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Ashraful Islam Mahim on 1/1/15.
 */
public class j18_08 extends Applet implements ItemListener {
    String msg="";
    Checkbox C,CPP,JAVA;
    public void init()
    {
        C=new Checkbox("C",null,true);
        CPP=new Checkbox("CPP");
        JAVA=new Checkbox("JAVA");

        add(C);
        add(CPP);
        add(JAVA);
        C.addItemListener(this);
        CPP.addItemListener(this);
        JAVA.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent itemEvent)
    {
        repaint();
    }

    public void paint(Graphics graphics)
    {
        msg="current state: ";
        graphics.drawString(msg,10,80);
        msg=" C: "+C.getState();
        //msg="current state: ";
        graphics.drawString(msg,10,100);
        msg=" CPP: "+CPP.getState();
        //msg="current state: ";
        graphics.drawString(msg,10,120);
        msg=" JAVA: "+JAVA.getState();
        graphics.drawString(msg,10,140);
    }
}

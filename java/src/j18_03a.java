import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Ashraful Islam Mahim on 1/1/15.
 */
public class j18_03a extends Frame {
    public j18_03a()
    {
        addWindowListener(new mywindowadapter());
    }

    public static void main(String[] args)
    {
        j18_03a appwin=new j18_03a();
        appwin.setSize(new Dimension(400,300));
        appwin.setTitle("press x to close the window.");
        appwin.setVisible(true);
    }
}

class mywindowadapter extends WindowAdapter
{
    public void windoClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

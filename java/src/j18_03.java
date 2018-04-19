import java.awt.*;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
public class j18_03 extends Frame {
    public j18_03()
    {
        addWindowListener(new mywindowadapter());
    }

    public static void main(String[] args)
    {
        j18_03 appwin=new j18_03();
        appwin.setSize(new Dimension(400,200));
        appwin.setTitle("press x to close the window");
        appwin.setVisible(true);
    }
}

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Ashraful Islam Mahim on 1/1/15.
 */
public class j18_07 extends Applet {
    Canvas canvas=new Canvas();
    public void init()
    {
        canvas.setSize(500,300);
        canvas.setBackground(Color.blue);
        add(canvas);
    }
}

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
public class mywindowadapter extends WindowAdapter {
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

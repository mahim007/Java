import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Ashraful Islam Mahim on 12/24/14.
 */
public class calculatorframe extends Frame {
    public calculatorframe()
    {
        setTitle("calculator application");
        setSize(400,200);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        add(new calculatorpanel());
    }
}

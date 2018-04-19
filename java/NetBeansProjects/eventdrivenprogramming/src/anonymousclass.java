
import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class anonymousclass extends Applet{
    @Override
    public void init(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                showStatus("mouse pressed");
            }
});
    }
}
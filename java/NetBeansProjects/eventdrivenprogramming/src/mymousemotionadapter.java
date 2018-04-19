
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class mymousemotionadapter extends MouseMotionAdapter{
    adapterclass ac;
    public mymousemotionadapter(adapterclass ac){
        this.ac=ac;
    }
    public void mouseDragged(MouseEvent e){
        ac.showStatus("mouse dragged");
    }
}

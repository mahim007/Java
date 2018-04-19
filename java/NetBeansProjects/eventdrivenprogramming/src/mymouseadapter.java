
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class mymouseadapter extends MouseAdapter{
    adapterclass ac;
    public mymouseadapter(adapterclass ac){
        this.ac=ac;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        ac.showStatus("mouse clicked");
    }
}

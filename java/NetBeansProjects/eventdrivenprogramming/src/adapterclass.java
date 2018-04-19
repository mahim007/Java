
import java.applet.Applet;
import java.awt.event.MouseAdapter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class adapterclass extends Applet{
   @Override
   public void init(){
       addMouseListener(new mymouseadapter(this));
       addMouseMotionListener(new mymousemotionadapter(this));
   }
}

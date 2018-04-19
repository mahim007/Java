
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
class okclass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ok button clicked");
        System.out.println(e.getSource());
        System.out.println(e.getWhen());//To change body of generated methods, choose Tools | Templates.
    }
}

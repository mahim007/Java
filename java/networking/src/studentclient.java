import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by mahim on 10-Jun-17.
 */
public class studentclient extends JApplet {
    private JTextField jtfname=new JTextField(20);
    private JTextField jtfcity=new JTextField(20);
    private JTextField jtfstreet=new JTextField(20);
    private JTextField jtfzip=new JTextField(20);

    private JButton jbtregister=new JButton("Click to register");
    private boolean isstandalone=false;

    String host="localhost";

    public void init(){
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(4,1));
        p1.add(new JLabel("Name:"));
        p1.add(new JLabel("Street:"));
        p1.add(new JLabel("City:"));
        p1.add(new JLabel("Zip:"));

        JPanel p2=new JPanel();
        p2.setLayout(new GridLayout(4,1));
        p2.add(jtfname);
        p2.add(jtfcity);
        p2.add(jtfstreet);
        p2.add(jtfzip);

        JPanel p3=new JPanel();
        p3.setLayout(new GridLayout(1,1));
        p3.add(jbtregister);

        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);
        add(p3, BorderLayout.SOUTH);

        jbtregister.addActionListener(new Buttonlistener());

        //if(isstandalone==true) host=getCodeBase().getHost();
    }

    private class Buttonlistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                Socket socket=new Socket(host, 8000);
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());

                String name=jtfname.getText().trim();
                String city=jtfcity.getText().trim();
                String street=jtfstreet.getText().trim();
                String zip=jtfzip.getText().trim();

                studentaddress s=new studentaddress(name,city,street,zip);
                objectOutputStream.writeObject(s);
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Register student client");
        studentclient applet=new studentclient();
        applet.isstandalone=true;

        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();

        frame.pack();
        frame.setVisible(true);
    }
}

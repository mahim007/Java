import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by mahim on 09-Jun-17.
 */
public class client extends JFrame {
    private JTextField jTextField=new JTextField();
    private JTextArea jTextArea=new JTextArea();

    private DataInputStream fromserver;
    private DataOutputStream toserver;

    public static void main(String[] args) {
        new client();
    }

    public client(){
        JPanel p1=new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JLabel("enter radious"), BorderLayout.WEST);
        p1.add(jTextField, BorderLayout.CENTER);
        jTextField.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(new JScrollPane(jTextArea), BorderLayout.CENTER);

        jTextField.addActionListener(new textfieldlistener());

        setTitle("client");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try{
            Socket socket=new Socket("localhost", 8000);
            fromserver=new DataInputStream(socket.getInputStream());
            toserver=new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }

    private class textfieldlistener implements ActionListener{
        public void actionPerformed(ActionEvent event){
           try{
               double rad=Double.parseDouble(jTextField.getText().trim());
               toserver.writeDouble(rad);
               toserver.flush();

               double area=fromserver.readDouble();
               jTextArea.append("radious is :"+rad +"\n");
               jTextArea.append("area received from server is: " +area + "\n");
           }
           catch (IOException ex){
               System.err.println(ex);
           }
        }
    }
}

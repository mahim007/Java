import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by mahim on 09-Jun-17.
 */
public class client2 extends JFrame {
    private JTextField jTextField=new JTextField();
    private JTextArea jTextArea=new JTextArea();

    private DataInputStream in;
    private DataOutputStream out;

    public static void main(String[] args) {
        new client2();
    }

    public client2(){
        JPanel p2=new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JLabel("enter input"), BorderLayout.NORTH);
        p2.add(jTextField, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        add(p2, BorderLayout.NORTH);
        add(new JScrollPane(jTextArea), BorderLayout.CENTER);

        jTextField.addActionListener(new listening());

        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("client 2");
        setVisible(true);

        try{
            Socket socket=new Socket("localhost", 8000);
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    class listening implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                double rad=Double.parseDouble(jTextField.getText().trim());
                out.writeDouble(rad);
                out.flush();

                double area=in.readDouble();
                jTextArea.append("rad is: "+rad+"\n");
                jTextArea.append("area received from server is: "+area+"\n");
            }
            catch (IOException ex){
                System.out.println(ex);
            }

        }
    }
}

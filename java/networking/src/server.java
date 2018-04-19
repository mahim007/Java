import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by mahim on 08-Jun-17.
 */
public class server extends JFrame {
    private JTextArea txt=new JTextArea();

    public static void main(String[] args) {
        new server();
    }

    public server(){
        setLayout(new BorderLayout());
        add(new JScrollPane(txt), BorderLayout.CENTER);
        setTitle("server");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try{
            ServerSocket serverSocket=new ServerSocket(8000);
            txt.append("server started at "+ new Date() + "\n");
            Socket socket=serverSocket.accept();

            DataInputStream inputfromclient=new DataInputStream(socket.getInputStream());
            DataOutputStream outputtoclient=new DataOutputStream(socket.getOutputStream());

            while (true){
                double radious=inputfromclient.readDouble();
                double area=Math.PI*radious*radious;
                outputtoclient.writeDouble(area);
                txt.append("radious received: "+radious + "\n");
                txt.append("area calculated: "+area +"\n");
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by mahim on 09-Jun-17.
 */
public class multithreadserver extends JFrame {
    private JTextArea jTextArea=new JTextArea();

    public static void main(String[] args) {
        new multithreadserver();
    }

    public multithreadserver(){
        setLayout(new BorderLayout());
        add(new JScrollPane(jTextArea), BorderLayout.CENTER);

        setTitle("multithread server");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        int clientno=1;

        try{
            ServerSocket serverSocket=new ServerSocket(8000);
            jTextArea.append("multithread started at: "+new Date());

            while (true){
                Socket socket=serverSocket.accept();
                jTextArea.append("starting thread for "+clientno+" at: "+new Date()+" \n");

                InetAddress inetAddress=socket.getInetAddress();
                jTextArea.append("client no: "+clientno +" host name is: "+inetAddress.getHostName() +" host address is:"+inetAddress.getHostAddress());
                handleclient task=new handleclient(socket);
                new Thread(task).start();

                clientno++;
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }

    class handleclient implements Runnable{
        Socket socket;

        public handleclient(Socket socket){
            this.socket=socket;
        }

        public void run(){
            try{
                DataInputStream in=new DataInputStream(socket.getInputStream());
                DataOutputStream out=new DataOutputStream(socket.getOutputStream());

                while (true){
                    double rad=in.readDouble();
                    double area=Math.PI*rad*rad;
                    out.writeDouble(area);
                    jTextArea.append("given rad is: "+rad+"\n");
                    jTextArea.append("output calculated is: "+area+"\n");

                }
            }
            catch (IOException ex){
                System.err.println(ex);
            }
        }
    }
}

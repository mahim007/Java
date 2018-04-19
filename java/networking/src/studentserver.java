import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mahim on 10-Jun-17.
 */
public class studentserver {
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public static void main(String[] args) {
        new studentserver();
    }

    public studentserver(){
        try {
            ServerSocket serverSocket=new ServerSocket(8000);
            System.out.println("server started...");

            out=new ObjectOutputStream(new FileOutputStream("student.dat", true));

            while (true){
                Socket socket=serverSocket.accept();
                in=new ObjectInputStream(socket.getInputStream());
                Object object=in.readObject();
                out.writeObject(object);
                System.out.println("Object is stored");
            }

        }
        catch (IOException ex){
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex){
            System.out.println(ex);
        }
        finally {
            try{
                in.close();
                out.close();
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}

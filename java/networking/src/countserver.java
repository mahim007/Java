import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mahim on 09-Jun-17.
 */
public class countserver {
    private RandomAccessFile randomAccessFile;
    private int count=0;

    public static void main(String[] args) {
        new countserver();
    }

    public countserver(){
        try {
            ServerSocket serverSocket=new ServerSocket(8000);
            System.out.println("server started...");
            randomAccessFile=new RandomAccessFile("count.dat","rw");

            if(randomAccessFile.length()==0)
                count=0;
            else count=randomAccessFile.readInt();

            while (true){
                Socket socket=serverSocket.accept();
                DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
                count++;
                outputStream.writeInt(count);
                randomAccessFile.seek(0);
                randomAccessFile.writeInt(count);
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}

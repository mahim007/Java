import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by mahim on 09-Jun-17.
 */
public class identifyhostnameip {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(int i=0;i<args.length;i++){
            try {
                InetAddress inetAddress=InetAddress.getByName(args[i]);
                System.out.println("host address: "+inetAddress.getHostAddress());
                System.out.println("host name: "+inetAddress.getHostName());
            }
            catch (IOException ex){
                System.err.println(ex);
            }
        }

    }
}

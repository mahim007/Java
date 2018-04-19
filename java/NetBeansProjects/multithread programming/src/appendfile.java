
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class appendfile {
    public static void main(String[] args) throws IOException{
        boolean mode=true;
        try (FileWriter fw = new FileWriter("test.txt", mode)) {
            System.out.println("file opened");
            FileOutputStream fos=new FileOutputStream("test.txt", mode);
            char ch=(char)System.in.read();
            while(ch!='\n'){
                fos.write(ch);
                ch=(char)System.in.read();
            }
            System.lineSeparator();
        }
    }
}

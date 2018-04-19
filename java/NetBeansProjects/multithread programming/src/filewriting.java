
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class filewriting {
    public static void main(String[] args) throws IOException{
        try (FileWriter fw = new FileWriter("test.txt")) {
            System.out.println("new file opened");
            FileOutputStream fos=new FileOutputStream("test.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s=br.readLine();
            byte buf[]=s.getBytes();
            for(int i=0;i<buf.length;i++){
                fos.write(buf[i]);
            }
        }
    }
}

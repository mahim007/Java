
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class readingfile {
    public static void main(String[] args) throws IOException{
        String filename;
        System.out.println("enter your file name");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        filename=br.readLine();
        FileReader fr=new FileReader(filename);
        BufferedReader br1=new BufferedReader(fr);
        String s;
        while((s=br1.readLine())!=null){
            System.out.println(s);
        }
        fr.close();
    }
}

//problem no. 09
//problem description:writing into a data file

import java.io.*;

public class data_file {
    public static void main(String[] args) throws IOException
    {
        FileWriter fws=new FileWriter("javafiletest");
        System.out.println("A file named c:\\javafiletest is opened for u.");
        System.out.println("write something on the file and press enter to save:");
        FileOutputStream fos=new FileOutputStream("javafiletest");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        byte buf[]=s.getBytes();
        for(int i=0;i<buf.length;i++)
        {
            fos.write(buf[i]);
        }
        fws.close();
    }
}

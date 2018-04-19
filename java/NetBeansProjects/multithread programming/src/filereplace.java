
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class filereplace {
    public static  void  main(String[] args) throws FileNotFoundException, IOException{
        System.out.println("this is a file replacing program");
        File file=new File("test.txt");
        //file.createNewFile();
        if(file.exists()){
            System.out.println("source file already exists");
            char ch;
            System.out.println("add new line?? y\\n");
            ch=(char)System.in.read();
            if(ch=='y'){
                PrintWriter pqPrintWriter=new PrintWriter(file);
                System.out.println("write what ever you want");
                String s,p;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                p=br.readLine();
                s=br.readLine();
                System.out.println("writing s="+s);
                pqPrintWriter.write(s);
                System.out.println("writing finished....");
            }
        }
        else{
            System.out.println("new file created");
            try (PrintWriter pw = new PrintWriter(file)) {
                System.out.println("write what ever you want");
                String s;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                s=br.readLine();
                pw.println(s);
                System.out.println("writing finished");
            }
        }
        
        System.out.println("now creating target file");
        File targetFile=new File("target.txt");
        targetFile.createNewFile();
        try (PrintWriter pw = new PrintWriter(targetFile)) {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                String s=scanner.nextLine();
                pw.println(s);
            }
            scanner.close();
        }
    }
}


import java.io.BufferedReader;
import java.io.File;
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
public class feadfromfile {
    public static void main(String[] args)throws IOException{
        File file=new File("test.txt");
        try (PrintWriter pw = new PrintWriter(file)) {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter your text");
            String s=br.readLine();
            pw.append(s);
            System.out.println("writing finished");
            System.lineSeparator();
        }
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while(scanner.hasNext()){
                System.out.println(""+scanner.nextLine());
            }
        }
    }
}

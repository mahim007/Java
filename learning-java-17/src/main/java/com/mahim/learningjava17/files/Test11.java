package com.mahim.learningjava17.files;

import java.io.*;

public class Test11 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        if (file1.exists() && file2.exists()) {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            PrintWriter pw = new PrintWriter("file3.txt");

            String line1 = br1.readLine();
            String line2 = br2.readLine();

            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    pw.println(line1);
                    line1 = br1.readLine();
                }
                if (line2 != null) {
                    pw.println(line2);
                    line2 = br2.readLine();
                }
            }
            
            pw.flush();
            pw.close();
            br1.close();
            br2.close();
        } else {
            System.out.println("one or more input file missing");
        }
    }
}

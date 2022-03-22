package com.mahim.learningjava17.files;

import java.io.*;

public class Test8 {
    public static void main(String[] args) throws IOException {
        File file = new File("BufferedWriterDemo.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }

        br.close();
    }
}

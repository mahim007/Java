package com.mahim.learningjava17.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test9 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("print_writer_demo.txt");

        pw.write(100);
        pw.println(100);
        pw.println(true);
        pw.println('M');
        pw.println("Mahim");

        pw.flush();
        pw.close();
    }
}

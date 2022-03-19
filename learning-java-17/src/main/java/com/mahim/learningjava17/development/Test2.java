package com.mahim.learningjava17.development;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Console output");

        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("file output");
        pw.flush();
    }
}

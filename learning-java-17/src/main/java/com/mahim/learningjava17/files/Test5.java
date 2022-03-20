package com.mahim.learningjava17.files;

import java.io.FileReader;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        int read = fr.read();

        while (read != -1) {
            System.out.print((char) read);
            read = fr.read();
        }
    }
}

package com.mahim.learningjava17.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        File file = new File("file_writer_demo.txt");
        char[] chars = new char[(int) file.length()];
        FileReader fileReader = new FileReader(file);
        int read = fileReader.read(chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }

        fileReader.close();
        System.out.println("total " + read + " chars are read.");
    }
}

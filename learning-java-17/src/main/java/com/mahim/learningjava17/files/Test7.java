package com.mahim.learningjava17.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        File file = new File("BufferedWriterDemo.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        bw.write(100);
        bw.newLine();
        bw.write("this is a demo text");
        bw.newLine();
        char[] chars = {'a', 'b', 'c', 'd'};
        bw.write(chars);
        bw.newLine();

        bw.flush();
        bw.close();
        fileWriter.close(); // this one will be closed automatically
    }
}

package com.mahim.learningjava17.files;

import java.io.FileWriter;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file_writer_demo.txt", true);
        fw.write(97);
        fw.write('\n');

        fw.write("this is a FileWriter demo text");
        fw.write('\n');

        char[] chars = {'a', 'b', 'c', 'd'};
        fw.write(chars);
        fw.write('\n');

        fw.flush();
        fw.close();
    }
}

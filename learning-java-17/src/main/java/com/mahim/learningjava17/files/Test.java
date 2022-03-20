package com.mahim.learningjava17.files;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

    }
}

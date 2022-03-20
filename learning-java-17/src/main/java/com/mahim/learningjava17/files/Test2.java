package com.mahim.learningjava17.files;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("testdir");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
    }
}

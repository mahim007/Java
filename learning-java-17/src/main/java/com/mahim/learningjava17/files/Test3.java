package com.mahim.learningjava17.files;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File dir = new File("D:\\Images\\Image\\Camera");
        String[] list = dir.list();

        int count = 0;
        for (String s : list) {
            File file = new File(dir, s);
            if (file.isFile()) {
                count++;
                System.out.println(s);
            }
        }

        System.out.println("The total number: " + count);

    }
}

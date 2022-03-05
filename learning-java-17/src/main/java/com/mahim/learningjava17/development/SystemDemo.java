package com.mahim.learningjava17.development;

import java.util.Properties;

public class SystemDemo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
        String course = System.getProperty("course");
        if (course.equals("ocjp")) {
            System.out.println("this is ocjp course");
        }
    }
}

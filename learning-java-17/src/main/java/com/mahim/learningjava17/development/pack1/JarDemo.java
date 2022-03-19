package com.mahim.learningjava17.development.pack1;

import java.awt.*;
import java.awt.event.*;

public class JarDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("window is closing");
                }

                System.exit(0);
            }
        });

        frame.add(new Label("I can create executable jar file"));
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
}

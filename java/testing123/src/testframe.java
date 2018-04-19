import javax.swing.*;

public class testframe {
    public static void main(String[] args) {
        JFrame frame1=new JFrame();
        frame1.setSize(300,200);
        frame1.setLocation(200,100);
        frame1.setTitle("window 1");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JFrame frame2=new JFrame();
        frame2.setSize(300,200);
        frame2.setLocation(800,100);
        frame2.setTitle("window 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}

import javax.swing.*;
import java.util.Date;
import java.util.Random;

class library_function {
    public static void main(String[] args) {
        JLabel jLabel=new JLabel("Current date is:");
        JTextField jTextField=new JTextField(new Date().toString());

        JLabel jLabel1=new JLabel("Random Number:");
        Random random=new Random();
        int sh=random.nextInt(55);
        JTextField jTextField1=new JTextField(new String(""+sh));

        JPanel jPanel=new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);

        JFrame jFrame=new JFrame();
        jFrame.add(jPanel);
        jFrame.setSize(400,300);
        jFrame.setLocation(300,300);
        jFrame.setTitle("Date & Random number");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

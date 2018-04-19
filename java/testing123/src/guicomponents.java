import javax.swing.*;

public class guicomponents {
    public static void main(String[] args) {
        JButton jbtok=new JButton("OK");
        JButton jbtcancel=new JButton("CANCEL");

        JLabel jlbl=new JLabel("Enter Your Name:");
        JTextField jTextField=new JTextField("Enter Your Name:");

        JCheckBox jCheckBox1=new JCheckBox("Bold");
        JCheckBox jCheckBox2=new JCheckBox("Italic");

        JRadioButton jRadioButton1=new JRadioButton("Red");
        JRadioButton jRadioButton2=new JRadioButton("Green");

        JComboBox jComboBox=new JComboBox(new String[]{"ICT", "CSE", "TEXTILE"});

        JPanel jPanel=new JPanel();
        jPanel.add(jbtok);
        jPanel.add(jbtcancel);
        jPanel.add(jlbl);
        jPanel.add(jTextField);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jPanel.add(jComboBox);

        JFrame jFrame=new JFrame();
        jFrame.add(jPanel);
        jFrame.setSize(400,300);
        jFrame.setLocation(200,200);
        jFrame.setTitle("Testing GUI Components");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class guidatabase extends JFrame{
    private JTextField dept=new JTextField(10);
    private JButton showButton=new JButton("show");
    private PreparedStatement ps;
    Connection connection;
    
    public guidatabase(){
        //public void init(){
        
        initdb();
        JPanel p1=new JPanel(new FlowLayout());
        p1.add(new JLabel("dept"));
        p1.add(dept);
        add(p1, BorderLayout.NORTH);
        add(showButton,BorderLayout.SOUTH);
        showButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    showresult();
                } catch (SQLException ex) {
                    System.err.println("Exception!!!");
                }
            }
        });
    }
    public void showresult() throws SQLException{
        String sqlString="select *from student where dept=?";
        ps=(PreparedStatement)connection.prepareStatement(sqlString);
        ps.setString(1, dept.getText());
        ResultSet rs=(ResultSet)ps.executeQuery();
        while(rs.next()){
            String idString=rs.getString(1);
            String namString=rs.getString(2);
            String deptString=rs.getString(3);
            JOptionPane.showMessageDialog(null,"name:"+namString+"   id:"+idString+"   dept:"+deptString);
        }
    }
    /**
     *
     */
    public  void initdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook","root","root");
            System.out.println("database connected");
        }
        catch(Exception e){
            System.err.println("Exception");
        }
    }
    
    public static void main(String[] args){
        guidatabase frame=new guidatabase();
        frame.setTitle("gui basic database");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.init();
    }
}
